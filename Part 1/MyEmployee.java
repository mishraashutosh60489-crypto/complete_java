//This program shows the use of constructor and this operator
public class MyEmployee {
    private int id;
    private String name;
    public MyEmployee(String myName,int myId){
        id = myId;
        name = myName;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }

    static void main(String[] args) {
        MyEmployee a = new MyEmployee("Ashutosh",25);
        System.out.println(a.getId());
        System.out.println(a.getName());
    }
}