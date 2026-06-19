abstract class X{
    abstract void show();
}
class Y extends X{

    public void show() {
        System.out.println("Hello !");
    }
}


public class AbstractClass {
    static void main(String[] args) {
        Y y1 = new Y();
      //  X x1 = new X(); --> I can not make object of an abstract class
        y1.show();
    }
}
