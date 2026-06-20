interface MyCellphone{
    void Camera();
    void Calling();
    default void Unlock(){
        System.out.println("Phone Unclocked");
    }
    private void Warning(){
        System.out.println("Lock the phone after use");
    }
}
class Phone{
    void Ringing(){
        System.out.println("Phone is Ringing");
    }
}
class SmartPhone extends Phone implements MyCellphone{
    public void Camera(){
        System.out.println("Start recording or click a photo");
    }
    public void Calling(){
        System.out.println("Connecting..");
    }
}

public class MultipleInheritance {
    static void main(String[] args) {
        SmartPhone s24 = new SmartPhone();
        s24.Unlock();
        s24.Calling();
        s24.Camera();
        s24.Ringing();
    }
}
