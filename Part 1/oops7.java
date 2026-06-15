class Cylinder{
    int radius,height;
    public void setRadius(int r) {
        radius = r;
    }
    public int getRadius() {
            return radius;
        }

    public int getHeight(){
        return height;
    }
    public void setHeight(int h){
        height = h;
    }
    public float TotalSurfaceArea(){
        float temp = radius+height;
        return 2*3.14f*radius*temp;

    }
    public float TotalCurvedSurfaceArea(){
        return 2*3.14f*radius*height;
    }
    public float Volume(){
        return 3.14f*radius*radius*height;
    }

}
public class oops7 {
    static void main(String[] args) {
        Cylinder c = new Cylinder();
        c.setHeight(4);
        System.out.println("Height : "+c.getHeight());
        c.setRadius(5);
        System.out.println("Radius : "+c.getRadius());
        System.out.println("Total Surface area of the cylinder is : "+c.TotalSurfaceArea());
        System.out.println("Total Curved Surface area of the cylinder is : "+c.TotalCurvedSurfaceArea());
        System.out.println("Volume of the cylinder is : "+c.Volume());
    }
}