public class Error6 {
    static void main(String[] args) {
        try{
            for(int i=1;i<=10;i++){
                System.out.print(i+" ");
//                break;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally{
            System.out.println("\nThis is the end of the program");
        }
    }
}
