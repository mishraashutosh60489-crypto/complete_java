import java.util.*;
public class fibonacci{
	public static void fibonacciseries(int n){
		int first = 0,sec = 1,third;
		System.out.print(first+" "+sec+" ");
		for(int i=2;i<n;i++){
			third = first+sec;
			first = sec;
			sec = third;
			System.out.print(third+" ");
		}
		
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of terms:");
		int n = sc.nextInt();
		fibonacciseries(n);
	}
}