import java.util.Scanner;

class square{
   public float getArea(float a){
       return (a*a);
   }
   public float getPerimeter(float a){
       return (4.0f*a);
   }

}
public class oops3 {
    static void main(String[] args ) {
        square A = new square();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of the square : ");
        float a = sc.nextFloat();
        System.out.println("Area of the square is : "+A.getArea(a));
        System.out.println("Perimeter of the square is : "+A.getPerimeter(a));
    }
}