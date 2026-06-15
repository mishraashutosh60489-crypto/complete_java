import java.util.Scanner;
public class bitwise{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter 2 numbers:");
int a = sc.nextInt(),b = sc.nextInt();
System.out.println("a & b = "+(a&b));
System.out.println("a || b = "+(a|b));
System.out.println("a ^ b = "+(a^b));
System.out.println("a ~ b = "+(~b));
System.out.println("~b = "+(a<<1));
System.out.println("a = "+(a>>1));
 }
}