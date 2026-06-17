import java.util.Scanner;

public class recursionfactorial {
    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println("Factorial is : "+factorial(n));

    }
}