import java.util.*;
public class fact_fun{
	 public static void main(String[] args){
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a number:");
		 int n = sc.nextInt();
		 fact(n);
		 
	 }
 
 
 public static int fact(int n){
	 int fact = 1;
	 for(int i=1;i<=n;i++){
		 fact = fact*i;
	 }
	 System.out.println("Factorial of the number : "+fact);
	 return fact;
  }
}
 