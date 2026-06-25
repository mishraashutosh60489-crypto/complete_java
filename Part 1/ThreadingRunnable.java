class ThreadsRunnable1 implements Runnable{
    public void run(){
        while(true){
            System.out.println("1");
        }
    }

}
class ThreadsRunnable2 implements Runnable{
    public void run(){
        while(true){
            System.out.println("2");
        }
    }

}




public class ThreadingRunnable {
    public static void main(String[] args) {
        ThreadsRunnable1 t1 = new ThreadsRunnable1();
        Thread T = new Thread(t1);
        ThreadsRunnable2 t2 = new ThreadsRunnable2();
        Thread T1 = new Thread(t2);

        T.start();
        T1.start();
    }
}