import java.util.Scanner;
public class array5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements into the array : ");
        int[] a = new int[5];
        for(int i=0;i<a.length;i++) {
            a[i] = sc.nextInt();
        }
        int max,min;
        max = a[0];
        for(int i=0;i<a.length;i++){
            if(max<a[i]){
                max = a[i];
            }
        }
        System.out.println("Maximum element is : "+max);
        min = a[4];
        for(int i=a.length-1;i>=0;i--){
            if(min>a[i])
                min = a[i];
        }
        System.out.println("Minimum element is : "+min);
    }
}