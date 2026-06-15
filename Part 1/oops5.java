import java.util.Scanner;

class circle {
    public float getDiameter(float r) {
        return (2.0f * r);
    }

    public float getArea(float r) {
        return (3.14f * r * r);
    }

    public float getPerimeter(float r) {
        return (2.0f * 3.14f * r);
    }
}
public class oops5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of the circle : ");
        float r = sc.nextFloat();
        circle c1 = new circle();
        System.out.println("Diameter = "+c1.getDiameter(r));
        System.out.println("Area = "+c1.getArea(r));
        System.out.println("Perimeter = "+c1.getPerimeter(r));
    }
}
