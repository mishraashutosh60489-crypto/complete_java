class Thename extends Thread{
	public Thename(String name){
		super(name);
	}
	
	public void run(){
		System.out.println("Hello Guys !");
	}
}


public class Threadname{
	public static void main(String[] args){
		Thename t1 = new Thename("Ashutosh");
		t1.start();
		Thename t2 = new Thename("Raja");
		t2.start();
		System.out.println("Id of the thread t1 is "+t1.getId());
		System.out.println("Name of the thread t1 is "+t1.getName());
		System.out.println("Id of the thread t2 is "+t2.getId());
		System.out.println("Name of the thread t2 is "+t2.getName());
	}
}