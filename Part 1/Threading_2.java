class Thread3 extends Thread{
	public void run(){
		
		while(true){
		System.out.println("Good Morning");
		}
	}
}
class Thread4 extends Thread{
	public void run(){
		
		while(true){
			
		System.out.println("Welcome");
		try{
			Thread.sleep(200);
		}catch(InterruptedException e){
			throw new RuntimeException(e);
		}
	  }
	}
}





public class Threading_2{
	public static void main(String[] args){
		Thread3 t1 = new Thread3();
		Thread4 t2 = new Thread4();
		t1.start();
		t2.start();
	}
}