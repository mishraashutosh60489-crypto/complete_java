import java.util.Scanner;
public class digitrev{
	public static void rev(int n){
		int rev=0;
		while(n > 0){
			int digit = n%10;
			rev = rev*10+digit;
			n = n/10;
		}
		System.out.println("Reversed number is : "+rev);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		rev(n);
	}
}