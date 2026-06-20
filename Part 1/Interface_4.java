abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class SmartTelephone extends Telephone{
             void ring() {
                 System.out.println("Ring");
             }
             void lift(){
                 System.out.println("Lift");
             }
             void disconnect(){
                 System.out.println("Disconnected");

}
}


public class Interface_4 {
    static void main(String[] args) {
     SmartTelephone n = new SmartTelephone();
     n.ring();
     n.disconnect();
     n.lift();
     Telephone n1 = new SmartTelephone();

     // SmartTelephone n2 = new Telephone();--> Throws error
    }
}
