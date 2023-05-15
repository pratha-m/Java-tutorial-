class MyThreadRunnable1 implements Runnable{
        public void run(){
            System.out.println("I am Runnable Thread 1");
        }
}
class MyThreadRunnable2 implements Runnable{
        public void run(){
            System.out.println("I am Runnable Thread 2");
        }
}
public class CWH_71_CH13_createThreadUsingRunnableInterface {
   public static void main(String[] args) { 
       MyThreadRunnable1 t1=new MyThreadRunnable1();
       MyThreadRunnable2 t2=new MyThreadRunnable2();
       
   }   
}
