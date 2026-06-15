class cellphone{
    public void Ringing() {
        System.out.println("Ringing.....");
    }
    public void Vibrating() {
        System.out.println("Vibrating...");
    }
    public void Calling(){
        System.out.println("Calling...📱📞");
    }
}
public class oops2 {
    static void main(String[] args) {
        cellphone c1 = new cellphone();
        c1.Ringing();
        c1.Calling();
        c1.Vibrating();
    }
}