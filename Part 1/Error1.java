import java.util.Scanner;

public class Error1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter 2 float numbers for division : ");
            System.out.print("a = ");
            float a = sc.nextFloat();
            System.out.print("b = ");
            float b = sc.nextFloat();
            System.out.println("Enter 2 integer numbers for division : ");
            System.out.print("x = ");
            int x = sc.nextInt();
            System.out.print("y = ");
            int y = sc.nextInt();
            try{
                int d = x/y;
                 float c = a/b;
                System.out.println("Result is :"+c);
            } catch (Exception e) {
                System.out.println("Sorry! Unable to divide");
                System.out.println("Reason : "+e);
            }
            System.out.println("End of the program !");
        }
    }

