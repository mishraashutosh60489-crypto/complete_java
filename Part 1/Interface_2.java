abstract class Pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends Pen{
    void write(){
        System.out.println("Writing...");
    }
    void refill(){
        System.out.println("Refill the pen");
    }
    void ChangeNib(){
        System.out.println("Change the nib");
    }
}

public class Interface_2 {
    static void main(String[] args) {
        FountainPen p1 = new FountainPen();
        p1.write();
        p1.refill();
        p1.ChangeNib();
    }
}
