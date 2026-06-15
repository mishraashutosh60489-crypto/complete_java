
import java.util.Scanner;

public class array4 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements to the array : ");
        int[] a = new int[10];
        for(int i=0;i<a.length;i++){
            a[i] = sc.nextInt();

        }
        System.out.println("Before reverse the array is : ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("\nAfter reverse the array is : ");
        for(int i = a.length-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }
    }
}