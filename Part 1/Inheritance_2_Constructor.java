class Base{
     Base(){
         System.out.println("1.This is the base class constructor ");
     }
     Base(int a){
         System.out.println("1.This is the base class constructor with value : "+a);
     }
}
class Derived extends Base{
      Derived() {
          System.out.println("2.This is the derived class constructor ");
      }
      Derived(int a,int b){
          super(a);
          System.out.println("This  is the derived class constructor with the value : "+b);
      }
}
class SubDerived extends Derived {
    SubDerived(){
        System.out.println("3.This is the subderived constructor");
    }
    SubDerived(int a ,int b , int c){
        super(a,b);
        System.out.println("This is a SubDerived constructor with the value : "+c);
    }
}

public class Inheritance_2_Constructor {
    static void main(String[] args) {
//       Base a = new Base();
//       Derived d = new Derived();
        SubDerived b = new SubDerived(3,5,7);
    }
}
