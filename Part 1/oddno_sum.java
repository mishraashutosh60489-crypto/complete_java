import java.util.Scanner;
public class oddno_sum{
	public static void oddsum(int n){
		int sum = 0;
		for(int i=0;i<=n;i++){
			if(i%2 != 0){
				sum = sum + i;
			}
		}
		System.out.println("Sum of all odd numbers till "+n+" is "+sum);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = sc.nextInt();
		oddsum(n);
	}
}