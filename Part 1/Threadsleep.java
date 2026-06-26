

class MyThread extends Thread{
    public void run() {
        while (true) {
            System.out.println("Hello");
           try{
               Thread.sleep(2000);
           }catch (InterruptedException e){
               throw new RuntimeException(e);
           }
        }
    }
}



public class Threadsleep {
    static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.start();
        t2.start();
    }
}
