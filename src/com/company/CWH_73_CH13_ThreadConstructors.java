class MyThrRunnable implements Runnable{
    public void run(){
        System.out.println("running runnable thread");
    }
}
class MyThr extends Thread{
    public MyThr(String name){
       super(name);
    }
    public MyThr(Runnable r,String name){
        super(r,name);
    }
    public void run(){
        System.out.println("This is Thread"); 
    }
}
public class CWH_73_CH13_ThreadConstructors {
    public static void main(String[] args) {
        // MyThr t1=new MyThr("Pratham");
        // MyThr t2=new MyThr("Ram");
        // t1.start();
        // t2.start();
        // System.out.println("The id of the thread t1 is :"+t1.getId());
        // System.out.println("The name of the thread t1 is :"+t1.getName());
        // System.out.println("The id of the thread t2 is :"+t2.getId());
        // System.out.println("The name of the thread t2 is :"+t2.getName());

        // MyThrRunnable mr1=new MyThrRunnable();
        // MyThr t3=new MyThr(mr1, "Pratham");
        // Thread tr1 = new Thread(mr1);
        // t3.start();
        // System.out.println(t3.getName());
        // System.out.println(t3.threadId());
        // tr1.start();        
    }
}
