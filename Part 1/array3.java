public class array3 {
    public static void main(String[] args) {
        int[] a = {98,90,59,91,87};
        int sum = 0;
        for(int i = 0;i < 5;i++){
            sum = sum+a[i];
        }
        int avg = sum/5;
        System.out.println("Average mark is "+avg);
    }
}
