import java.util.*;
public class operations{
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two numbers for the operations(+,-,*,/,%) : ");
   int x = sc.nextInt();
   int y = sc.nextInt();
  //operations 
      System.out.println("Sum is : "+(x+y));
      System.out.println("Difference is : "+(x-y));
      System.out.println("Product is : "+(x*y));
      System.out.println("Divide is : "+(x/y));
      System.out.println("Modulus is : "+(x%y));
 }
}