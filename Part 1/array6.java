import java.util.Arrays;
import java.util.Scanner;

public class array6 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements into array : ");
        int[] a = new int[5];
        for(int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Array before sorting is : ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("\nArray after sorting is : ");
        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}