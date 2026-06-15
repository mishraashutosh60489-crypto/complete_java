class Employee{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }

}
public class oops1 {
    static void main(String[] args) {
        Employee Ashu = new Employee();
        Ashu.setName("Ashutosh");
        String name = Ashu.getName();
        System.out.println(name);
        Ashu.salary = 30000;
        int salary = Ashu.getSalary();
        System.out.println("Salary : "+salary);

    }
}