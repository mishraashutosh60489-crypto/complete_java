import java.util.Scanner;
public class simpleinterest{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
   System.out.println("Enter Prinipal(P),Rate of Interest(R) and time(T)in year:");
  int p = sc.nextInt(),r = sc.nextInt(),t = sc.nextInt();
  int si = (p*t*r)/100;
  System.out.println("Simple interest is : "+si);
 }
}