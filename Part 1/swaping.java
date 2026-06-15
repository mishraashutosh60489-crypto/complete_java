import java.util.*;
public class swaping{
   public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter a :");
   int a = sc.nextInt();
   System.out.print("Enter b :");
   int b = sc.nextInt();
System.out.println("Before swapping value of a and b is "+a+" and "+b+" respectively"); 
   int c;
   c = a;
   a = b;
   b = c;
System.out.println("After swapping value of a and b is "+a+" and "+b+" respectively"); 
 }
}
