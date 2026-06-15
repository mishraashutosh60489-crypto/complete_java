class TommyVecetti{
    public void run(){
        System.out.println("Running....");
    }
    public void  hit(){
        System.out.println("Hitting....");
    }
    public void fire(){
        System.out.println("Firing🧨");
    }

}
public class oops6 {
    static void main(String[] args) {
        TommyVecetti a = new TommyVecetti();
        a.fire();
        a.hit();
        a.run();
    }
}