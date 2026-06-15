class cylinder{
    cylinder(float r,float h){
        System.out.printf("Height : %.2f\nRadius : %.2f\n",h,r);
        System.out.println("Volume of the cylinder is : "+ 3.14f*r*r*h);
        System.out.println("Total curved surface area is : "+ 2*3.14f*r*h);
    };
}
public class oops8 {
    static void main(String[] args) {
        cylinder a = new cylinder(3,7);
    }
}