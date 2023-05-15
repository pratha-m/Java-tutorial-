class MyThread1 extends Thread{
    @Override
    public void run(){
        int i=1;
        while(i<=10){
            System.out.println("MyThread1 is Running");
            i++;
        }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run(){
         int i=1;
         while(i<=10){
            System.out.println("MyThread2 is Running");
            i++;
         }
    }
}
public class CWH_70_CH13_CreateThreadByExtending{
    public static void main(String[] args) {
        MyThread1 t1=new MyThread1();
        MyThread2 t2=new MyThread2();
        t1.start();
        t2.start();
    }
}