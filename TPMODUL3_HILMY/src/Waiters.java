public class Waiters implements Runnable{
    private final int QtyOrder;
    private final int IDcustomer;
    static int Foodprice = 23000;

    public Waiters(int IDcustomer, int QtyOrder){
        this.IDcustomer = IDcustomer;
        this.QtyOrder = QtyOrder;
    }
    @Override
    public void run(){
        while(true){
            makeFood();
            try{
                Thread.sleep(20000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    public void orderInfo(){
        System.out.println("=======================================");
        System.out.println("Customer ID: " + this.IDcustomer);
        System.out.println("Number of Food: " + this.QtyOrder);
        System.out.println("Total Price: " + this.QtyOrder*Foodprice);
        System.out.println("=======================================");
    }
    public void makeFood(){
        synchronized(Restaurant.getLock()){
            System.out.println("Waiter: Food is ready to deliver");
            Restaurant restaurant = new Restaurant();
            restaurant.setwaitingForPickup(false);
            if (Restaurant.getfoodNumber() == this.QtyOrder + 1){
                orderInfo();
                System.exit(0);
            }
            Restaurant.getLock().notifyAll();
            System.out.println("Waiter: Tell the restaurant to make another food\n");
        }
    }
}
