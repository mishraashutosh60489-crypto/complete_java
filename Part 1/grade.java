import java.util.*;

public class grade {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter subject marks of the student :");
        System.out.print("m1 = ");
        int m1 = sc.nextInt();
        System.out.print("\nm2 = ");
        int m2 = sc.nextInt();
        System.out.print("\nm3 = ");
        int m3 = sc.nextInt();
        System.out.print("\nm4 = ");
        int m4 = sc.nextInt();
        System.out.print("\nm5 = ");
        int m5 = sc.nextInt();
        System.out.print("\nm6 = ");
        int m6 = sc.nextInt();

        int total = m1 + m2 + m3 + m4 + m5 + m6;
        int per = total / 6;
        System.out.println("The student scored " + per + "%");
        if (per >= 90)
            System.out.println("A grade");
        else if (per >= 75)
            System.out.println("B grade");
        else if (per >= 60)
            System.out.println("C grade");
        else if (per >= 30)
            System.out.println("D grade");
        else if (per < 30)
            System.out.println("Fail!");
    }
}







 