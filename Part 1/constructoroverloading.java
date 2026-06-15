public class constructoroverloading {
    constructoroverloading(int a,int b){
        System.out.println("Sum is : "+(a+b));
    }
    constructoroverloading(int a, int b, int c){
        System.out.println("Sum is : "+(a+b+c));
    }

    static void main(String[] args) {
        constructoroverloading c1 = new constructoroverloading(2,4);
        constructoroverloading c2 = new constructoroverloading(4,6,7);

    }
}