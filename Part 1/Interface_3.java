interface Animal{
    void eat();
    void sleep();
}
abstract class Monkey implements Animal{

    void Jump(){
        System.out.println("Jumping..");
    }
    void Bite(){
        System.out.println("Biting...");
    }

}
class Human extends Monkey implements Animal{
    public void eat(){
        System.out.println("Eating...");
    }
    public void sleep(){
        System.out.println("Sleeping...");
    }
    void Reading(){
        System.out.println("reading...");
    }
}


public class Interface_3{
    static void main(String[] args) {
        Monkey A = new Human();
        A.eat();
        A.sleep();
       // Ashu.reading(); --> throws error

    }
}