

class ThreadPriority1 extends Thread{
    public ThreadPriority1(String name){
        super(name);
    }
    public void run(){
        int i = 0;
        while(i<100){
            System.out.println("Hello");
            i++;
        }
    }
}


public class ThreadPriority{
	public static void main(String[] args){
		ThreadPriority1 t1 = new ThreadPriority1("Ashutosh");
        ThreadPriority1 t2 = new ThreadPriority1("Mishra");
        t1.start();
        t2.start();
        System.out.println(t1.getName());
        t1.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t1.getPriority());
        System.out.println(t1.threadId());
        System.out.println(t1.getState());
        System.out.println(t1.getClass());

	}
}