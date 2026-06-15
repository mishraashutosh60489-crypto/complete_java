import java.util.*;
public class greatestno {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers for checking greater one :");
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("\nb = ");
        int b = sc.nextInt();
        System.out.print("\nc = ");
        int c = sc.nextInt();
        if (a > b && a > c)
            System.out.println("a is greater");
        else if (b > a && b > c)
            System.out.println("b is greater");
        else
            System.out.println("c is greater");
    }
}

