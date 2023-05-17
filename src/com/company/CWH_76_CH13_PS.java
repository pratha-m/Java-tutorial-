class PS_Thread1 extends Thread{
      public void run(){
        int i=0;
        while(i<=10){
            System.out.println("Good Morning"); 
            i++;
        }
      }
}
class PS_Thread2 extends Thread{
      public void run(){
        int i=0;
        while(i<=10){
            System.out.println("Welcome"); 
            try{
                Thread.sleep(200);
            }
            catch(Exception e){
                System.out.println(e);
            }
            i++;
        }
      }
}
class PS_Thread3 extends Thread{
    public void run(){
        int i=0;
        while(i<=10){
            System.out.println("Thread 3"); 
            i++;
        }
    }
}
class PS_Thread4 extends Thread{
    public void run(){
        int i=0;
        while(i<=10){
            System.out.println("Thread 4"); 
            i++;
        }
    }
}
public class CWH_76_CH13_PS {
    public static void main(String[] args) {
        // 1) 2)
        // PS_Thread1 t1=new PS_Thread1();
        // PS_Thread2 t2=new PS_Thread2();
        // t1.start();
        // t2.start();
   
        // 3)
        // PS_Thread3 t3=new PS_Thread3();
        // PS_Thread4 t4=new PS_Thread4();
        // t3.setPriority(Thread.MIN_PRIORITY);
        // t4.setPriority(Thread.MAX_PRIORITY);
        // t3.start();
        // t4.start();
        // System.out.println("The priority of Thread 3 is :"+t3.getPriority());
        // System.out.println("The priority of Thread 4 is :"+t4.getPriority());

        // 4)
        // PS_Thread3 t3=new PS_Thread3();
        // System.out.println("Thread 3 state before start :"+t3.getState());
        // t3.start();
        // System.out.println("Thread 3 state after start :"+t3.getState());

        // 5)
        System.out.println(Thread.currentThread().getState());
        
    }
}
