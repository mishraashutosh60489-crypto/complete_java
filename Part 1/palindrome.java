import java.util.*;
public class palindrome{
	public static int rev(int n){
		int rev=0;
		while(n > 0){
			int digit = n%10;
			rev = rev*10+digit;
			n = n/10;
		}
		return rev;
	}
	public static int palindromecheck(int n){
		int temp = n;
		int rev = rev(n);
		if(temp == rev){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not palindrome");
		}
		return 0;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number for checking palindrome or not : ");
		int n = sc.nextInt();
		palindromecheck(n);
	}
}