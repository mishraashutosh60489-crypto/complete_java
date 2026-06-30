public class Error7 {
    static void main(String[] args) {
        //1.
//        int a --> Missing semicolon is a syntax error
//        logical error
//        runtime error

        //2.
        int a = 9;
        int b = 0;
        try{
            try{
                int c = a/b;
            }
            catch (ArithmeticException e){
                System.out.println("HaHa");
            }
        }
        catch (IllegalArgumentException e){
            System.out.println("HeHe");
        }


    }
}
