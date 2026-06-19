import java.util.Scanner;

class Circle1{
    public int radius;
    Circle1(){
        System.out.println("Hey! I am a constructor of the Class circle");
    }
    Circle1(int radius){
        System.out.println("Hey! I am a constructor of the class Circle with radius : "+radius);

    }
    void Area(int radius){
        System.out.println("Area of the circle is : "+(Math.PI*radius*radius));
    }
}
class Cylinder1 extends Circle1{
    public int height;
    Cylinder1(){
        System.out.println("Hey! I am a constructor of the class Cylinder1 ");
    }
    Cylinder1(int height,int radius){
        super(radius);
        System.out.println("Hey! I am a constructor of class Cylinder1 with height : "+height);
    }
    void Volume(int radius,int height){
        System.out.println("Volume of the Cylinder is : "+Math.PI*radius*radius*height);
    }
}

public class Inheritance_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius and height respectively : ");
        int r = sc.nextInt();
        int h = sc.nextInt();
        Cylinder1 c = new Cylinder1(r,h);
        c.Area(r);
        c.Volume(r,h);
    }
}