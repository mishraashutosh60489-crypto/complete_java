import java.util.*;
public class sum_of_digits{
	public static void digit(int n){
		int rem,sum=0;
		while(n!=0){
			sum = sum+(n%10);
			n = n/10;
		}
		System.out.println("Sum is "+sum);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		digit(n);
	}
}