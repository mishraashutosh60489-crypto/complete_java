import java.util.Scanner;

class rectangle{
    public float areaofrect(float a,float b){
        return (a*b);
    }
    public float perimeterofrect(float a,float b){
        return (2.0f*(a+b));
    }

}
public class oops4 {
    static void main(String[] args ) {
        rectangle A = new rectangle();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length and width of the rectangle respectively : ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        System.out.println("Area of the rectangle is : "+A.areaofrect(a,b));
        System.out.println("Perimeter of the rectangle is : "+A.perimeterofrect(a,b));
    }
}