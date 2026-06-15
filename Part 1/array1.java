public class array1{
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        System.out.print("The array is : ");
        for(int i = 0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        int sum = 0;
        for(int i = 0;i<5;i++){
           sum = sum + a[i];
        }
        System.out.println("\nSum of the array is "+sum);
    }
}