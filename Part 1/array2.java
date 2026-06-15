
import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find that is present in array or not :");
        int n = sc.nextInt();
        int i = 0;
        while(i<10){
            if(a[i] == n){
            System.out.println("Number found at "+i);
            break;
            }
            else{
                System.out.println("Number not found !");
            }
            i++;
        }
    }
}
