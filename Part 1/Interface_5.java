interface TvRemote{
    void SwitchOn();
    void SwitchOff();
    void VolumeUp(int increment);
    void VolumeDown(int decrement);
}
interface SmartTvRemote extends TvRemote{
    default void Youtube(){
        System.out.println("Opening youtube");
    }
    default void Spotify(){
        System.out.println("Listen music on spotify");
    }
    default void Netflix(){
        System.out.println("Enjoy movies and web series");
    }
}
class Tv implements TvRemote,SmartTvRemote{
    public void SwitchOn(){
        System.out.println("Switching on...");
    }
    public void SwitchOff(){
        System.out.println("Switching off...");
    }
    public void VolumeUp(int increment){
        System.out.println("Increased volume by "+increment);
    }
    public void VolumeDown(int decrement){
        System.out.println("Decreased volume by "+decrement);
    }
}

public class Interface_5 {
    static void main(String[] args) {
        Tv samsung = new Tv();
        samsung.SwitchOn();
        SmartTvRemote sm = new Tv();
        sm.Netflix();
        sm.Spotify();
        sm.Youtube();
        sm.SwitchOff();
    }
}
