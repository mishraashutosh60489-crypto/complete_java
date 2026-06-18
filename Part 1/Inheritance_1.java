class Baap{
    public int x;
    public int y;
    public int  getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
    }
    void sum(int x,int y){
        System.out.println("Sum of the two numbers is : "+(x+y));
    }
}
class Beta extends Baap{
    void multiplication(int x,int y,int z){
        System.out.println("Product of the three numbers is : "+(x*y*z));
    }
}
public class Inheritance_1 {
    static void main(String[] args) {
        Beta a = new Beta();
        a.multiplication(3,78,0);

    }
}