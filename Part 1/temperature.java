import java.util.*;
public class temperature{
  public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter temperature in Fahrenheit : ");
float f = sc.nextInt();
//convertion
 float c = (f-32)*5/9;
System.out.printf("%f Farhenheit = %f Celsius",f,c);
 }
}
 