import java.util.Scanner;

public class Error2 {
    public static void main(String[] args){
        int [] a = new int[3];
        a[0] = 3;
        a[1] = 56;
        a[2] = 40;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index : ");
        int ind = sc.nextInt();
        System.out.println("Enter the number to divide :");
        int num = sc.nextInt();
        try{
            System.out.println("Value at the given index is :"+a[ind]);
            System.out.println("Result is : "+a[ind]/num);
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic exception occurred !");
        } catch (Exception e) {
            System.out.println("Some other exception occurred !\n"+e);
        }
    }
}
