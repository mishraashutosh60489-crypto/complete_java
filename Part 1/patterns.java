import java.util.*;
public class patterns{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
	System.out.print("Enter number of lines : ");
	int n = sc.nextInt();
	right_half_pyramid(n);
	reverse_right_half_pyramid(n);
	left_half_pyramid(n);
 }
  public static void right_half_pyramid(int n){
	  System.out.println("Printing right half pyramid...");
	  for(int i = n;i>=1;i--){
		  for(int j=1;j>=n-1;j++){
			  System.out.print(" ");			 
			
			    }
				
	  for(int k = 1;k<=i;k++){
			 System.out.print("* ");
			
			} System.out.println();
			
	  }
	
  }
  public static void reverse_right_half_pyramid(int n){
	   System.out.println("Printing reverse right half pyramid...");
	  for(int i=1;i<=n;i++){
		for(int j=n;j>=i;j--){
			System.out.print("* ");
		}
		System.out.println("");
	  }
  }
  public static void left_half_pyramid(int n){
	   System.out.println("Printing left half pyramid...");
	  for(int i=1;i<=n;i++){
		  for(int j=1;j<=n-1;j++){
			  System.out.print(" ");
		  }
		  for(int k=1;k<=i;k++){
			  System.out.print("* ");
		  }
		  System.out.println();
	  }
  }
}