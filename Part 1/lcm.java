import java.util.Scanner;
public class lcm{
	public static int lcmm(int a, int b){
		int i = 1;
		while(true){
			int factor = a*i;
			if(factor % b == 0){
				return factor;
			}
			i++;
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st and 2nd number:");
		int a = sc.nextInt(),b = sc.nextInt();
		int factor = lcmm(a,b);
		System.out.println("LCM = "+factor);
	}
}