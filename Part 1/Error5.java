import java.util.Scanner;

class  NegativeRadiusException extends Exception{
    @Override
    public String getMessage() {
        return "Radius can not be negative ";
    }
}


public class Error5 {

    public static double Area (double r) throws NegativeRadiusException{
        if(r<0){
            throw new NegativeRadiusException();
        }
        else{
            double area = Math.PI*r*r;
            System.out.println("Area is :"+area);
        }
        return 0;
    }

    static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        try {
            Area(r);
        }catch (Exception e){
            System.out.println("Exception = "+e);
        }
    }
}