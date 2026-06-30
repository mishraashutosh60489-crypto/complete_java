import java.util.Scanner;

class MyException extends Exception{

    public String toString() {
        return super.toString()+"Ashutosh Error";
    }

    @Override
    public String getMessage() {
        return super.getMessage()+"This is a custom message ";
    }
}


public class Error4 {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        a = sc.nextInt();
        if(a<9){
            try{
                throw new ArithmeticException("This is a exception");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e.getStackTrace());
            }
        }
    }
}
