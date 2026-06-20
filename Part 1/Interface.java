interface Bicycle{
    int a = 58;
    void applyBreak(int decrement);
    void speedUp(int increment);
}
class MyCycle implements Bicycle{
    public void applyBreak(int decrement) {
        System.out.println("Applying break");
    }

    public void speedUp(int increment) {
        System.out.println("Speeding up");
    }
}



public class Interface {
    static void main(String[] args) {
        MyCycle Ashu = new MyCycle();
        Ashu.applyBreak(1);
        Ashu.speedUp(2);
        System.out.println(Ashu.a);
    }
}