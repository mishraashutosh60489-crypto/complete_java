import java.util.*;
public class prime{
	public static boolean isPrime(int n){
      int i = 2;
	  while(i < n){
		  if(n % i == 0){
			  return false;
		  }
		  i++;
	  }
	  return true;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		boolean isPrime = isPrime(n);
		if(isPrime){
			System.out.println("Prime");
		}
		else{
			System.out.println("Not prime");
		}
		
	}
}