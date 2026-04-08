package ThreadPractice;
class MyThread extends Thread{
    public void run(){
        System.out.println("Thread Started" +getName());
    }
}
public class Simple {
    public static void main(String[] args) {
        MyThread t1=new MyThread();
        MyThread t2=new MyThread();
        t1.start();// creates new thread
        t2.start();
//        t1.run(); //normal main method
//        t2.run();
    }
}
