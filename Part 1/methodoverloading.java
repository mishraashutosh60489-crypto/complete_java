public class methodoverloading {
    void sum(int a,int b){
        System.out.println("Sum is : "+(a+b));
    }
    void sum(float a,float b){
        System.out.println("Sum is : "+(a+b));
    }

    static void main(String[] args) {
        methodoverloading m = new methodoverloading();
        m.sum(2,4);
        m.sum(3.5f,6.8f);

    }
}