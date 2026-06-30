import java.util.Scanner;

class InvalidInputException extends Exception {
    @Override
    public String getMessage() {
        System.out.println("InvalidInputException");
        return super.getMessage();
    }
}

public class CustomCalculator {
    void MyExceptions() throws InvalidInputException{
        System.out.println("Error");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        int a, b, c;
        System.out.println("Enter 2 numbers : ");
        a = sc.nextInt();

        b = sc.nextInt();
        System.out.println("Enter your choice : ");
        ch = sc.next().charAt(0);
        try {
            switch (ch) {
                case '+':
                    c = a + b;
                    System.out.println(c);
                    break;
                case '-':
                    c = a - b;
                    System.out.println(c);
                    break;
                case '*':
                    c = a * b;
                    System.out.println(c);
                    break;
                case '%':
                    c = a % b;
                    System.out.println(c);
                    break;
                case '/':
                    c = a / b;
                    System.out.println(c);
                    break;
                default:
                    System.out.println("Wrong choice !");
            }

        }catch (Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("Successfully calculated!");
        }

    }
}

