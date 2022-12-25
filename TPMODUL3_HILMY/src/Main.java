import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Restaurant restaurant = new Restaurant();
            int IDcustomer, QtyOrder;           
            try {    
                System.out.println("Enter Customer ID: ");
                IDcustomer = input.nextInt();
                System.out.println("Enter how much Food to made: ");
                QtyOrder = input.nextInt();
                Thread Thread1 = new Thread(restaurant);
                Waiters Waiters = new Waiters(IDcustomer, QtyOrder);
                Thread Thread2 = new Thread(Waiters);
                Thread1.start();
                Thread2.start();
                Thread1.join();
                Thread2.join();
            } catch (Exception e) {
                System.out.println("Input must be Integer");
            }           
        }
    }
}