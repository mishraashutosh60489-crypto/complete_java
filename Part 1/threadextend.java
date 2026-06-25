class Threading1 extends Thread{
    public void run(){
        int i=0;
        while(i<1000){
            System.out.println("Cooking");
            i++;
        }
    }
}
class Threading2 extends Thread{
    public void run(){
        int i=0;
        while(i<1000){
            System.out.println("Chatting");
            i++;
        }
    }
}
class Threading3 extends Thread{
    public void run(){
        int i=0;
        while(i<1000){
            System.out.println("Reading");
            i++;
        }
    }
}




public class threadextend {
    public static void main(String[] args){
        Threading1 t1 = new Threading1();
        Threading2 t2 = new Threading2();
        Threading3 t3 = new Threading3();
        t1.start();
        t2.start();
        t3.start();
    }
}
