import java.util.*;
public class agegroup{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter your age : ");
int age = sc.nextInt();
if(age<=13)
System.out.println("Child");
else if(age>13 && age<=20)
System.out.println("Teen");
else if(age>20 && age<60)
System.out.println("Adult");
else if(age>=60)
System.out.println("Senior");
else
System.out.println("Error!");
 }
}
