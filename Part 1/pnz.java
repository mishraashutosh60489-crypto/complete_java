import java.util.*;
public class pnz{
  public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter a number to check positive/negative/zero :");
int n = sc.nextInt();
if(n>0)
System.out.println("Positive");
else if(n<0)
System.out.println("Negative");
else
System.out.println("It is zero!");
 }
}
