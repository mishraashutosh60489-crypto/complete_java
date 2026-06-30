import java.util.Scanner;
class MyException1 extends Exception{
    public void tell(){
        System.out.println("My Exception");
    }
}
public class Error8 {
    static void main(String[] args) throws MyException1 {
        int[] arr = new int[3];
        arr[0] = 10;
        arr[1] = 30;
        arr[2] = 20;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int i = 0,ind;
        while(flag && i<5){
            System.out.println("Enter array index : ");
            ind = sc.nextInt();
            try {
                System.out.println("Value at the index is : " + arr[ind]);
                throw new MyException1();
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
        }
    }
}