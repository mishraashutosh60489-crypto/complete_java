class Super{
    public void meth1(){
        System.out.println("This is the method 1 of super class");
    }
    public void meth2(){
        System.out.println("This is the method 2 of super class");
    }
}
class Sub extends Super{
    public void meth2(){
        System.out.println("This is the method 2 of Sub class ");
    }
    public void meth3(){
        System.out.println("This is the method 3 of sub class ");
    }
}

public class DynamicMethodDispatch {
    static void main(String[] args) {
        Super obj = new Sub();
        obj.meth2();
       // obj.meth3(); --> It is not allowed because meth3 is not available for the object of super class
       // Sub obj1 = Super(); --> Not allowed
    }
}
