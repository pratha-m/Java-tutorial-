class MyThreadRunnable1 implements Runnable{
        public void run(){
            int i=0;
            while(i<=10){
                System.out.println("I am Runnable Thread 1");
                i++;
            }
        }
}
class MyThreadRunnable2 implements Runnable{
        public void run(){
            int i=0;
            while(i<=10){
                System.out.println("I am Runnable Thread 2");
                i++;
            }
        }
}
public class CWH_71_CH13_createThreadUsingRunnableInterface {
   public static void main(String[] args) { 
       MyThreadRunnable1 bullet1=new MyThreadRunnable1();
       Thread gun1=new Thread(bullet1);

       MyThreadRunnable2 bullet2=new MyThreadRunnable2();
       Thread gun2=new Thread(bullet2);

       gun1.start();
       gun2.start();
   }   
}
