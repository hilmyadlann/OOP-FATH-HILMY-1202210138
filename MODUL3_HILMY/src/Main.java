import java.util.Scanner;
import java.util.InputMismatchException;

public class Main{
    public static void main(String[] args) throws InterruptedException {
        boolean repeat = true;
        Scanner input = new Scanner(System.in);
        Calculation calculation = new Calculation();

        do {
            try {
System.out.println("\n === Menu Program ==");
System.out.println("1. Square");
System.out.println("2. Circle");
System.out.println("3. Trapoized");
System.out.println("0. Exit");
System.out.print("Select menu : ");
int option = input.nextInt();

                switch (option) {
                    case 1:
                        System.out.print("Enter the length of the side of the square : ");
                        double sisi = input.nextDouble();
                        calculation.setSquare(sisi);
                        calculation.run();
                        System.out.println("\nThe calculation result : " + calculation.getSquare());
                        break;
                    case 2:
                        System.out.print("Enter the radius of the circle : ");
                        double r = input.nextDouble();
                        calculation.setCircle(r);
                        calculation.run();
                        System.out.println("\nThe calculation result : "+ calculation.getCircle());
                        break;
                    case 3:
                        System.out.print("Enter the side of the base of trapezoid : ");
                        double a = input.nextDouble();
                        System.out.print("Enter the upperside of trapezoid : ");
                        double b = input.nextDouble();
                        System.out.print("Enter the height trapezoid : ");
                        double t = input.nextDouble();
                        calculation.setTrapezoid(a, b, t);
                        calculation.run();
                        System.out.println("\nThe calculation  result : "+ calculation.getTrapezoid());
                    case 0:
                        System.out.println("Program End");
                        break;
                    default:
                        System.out.println("Opsi tidak tersedia");
                        continue;
                    }
                    repeat = false;
                  } catch (InputMismatchException e) {
                    System.out.println("\n====Error: Input must be a number====");
                    input.next();
                  } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                  }
                } while (repeat);
            
                input.close();
              }
            }
