import java.util.*;
public class leapyear{
 public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a year :");
 int yr = sc.nextInt();
 if((yr%4 == 0 && yr%100 != 0) || (yr%400 == 0))
System.out.println("Leap year!");
else
System.out.println("Not a leap year!");
 }
}