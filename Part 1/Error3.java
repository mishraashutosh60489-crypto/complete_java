import java.util.Scanner;

public class Error3 {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        arr1[3] = 40;
        arr1[4] = 50;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag) {
            System.out.println("Enter number index number :");
            int ind = sc.nextInt();


            try {
                System.out.println("Welcome to error handling :");
                try {
                    System.out.println("Value is " + arr1[ind]);
                    flag = false;
                } catch (Exception e) {
                    System.out.println("Internal error!");
                }
            } catch (Exception e) {
                System.out.println("External error!");
            }

        }
    }
}
