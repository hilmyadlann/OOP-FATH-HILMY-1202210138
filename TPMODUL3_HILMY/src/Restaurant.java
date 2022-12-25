public class Restaurant implements Runnable{
    private boolean Forpickup = false;
    private static final Object lock = new Object();
    private static int Numfood = 1;

    @Override

    public void run() {
        while (true) {
            makeFood();
            try {
                Thread.sleep(8000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void setwaitingForPickup(boolean Forpickup) {
        this.Forpickup = Forpickup;
    }

    public static int getfoodNumber() {
        return Numfood;
    }

    public void makeFood() {
        synchronized(Restaurant.lock) {
            if (this.Forpickup) {
                try {
                    System.out.println("Restaurant : Waiting for the waiter to deliver the food");
                    Restaurant.lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            Forpickup = true;
            System.out.println("Restaurant : Making Food Number " + Numfood++);
            Restaurant.lock.notifyAll();
            System.out.println("Restaurant : Telling the waiter to get the Food\n");
        }
    }

    public static Object getLock() {
        return lock;
    }
}

