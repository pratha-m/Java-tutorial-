class MyThr1 extends Thread{
    public MyThr1(String name){
       super(name);
    }
    public void run(){
        int i=0;
        while(i<=20){
            System.out.println("This is Thread With name :"+this.getName()); 
            i++;
        }
    }
}
public class CWH_74_CH13_ThreadPriorities {
   public static void main(String[] args) {
       // Ready Queue : contains threads which are ready to run 
       MyThr1 t1=new MyThr1("Pratham1");
       MyThr1 t2=new MyThr1("Pratham2");  
       MyThr1 t3=new MyThr1("Pratham3");  
       MyThr1 t4=new MyThr1("Pratham4");  
       MyThr1 t5=new MyThr1("Pratham5 (Most Important)"); 
       t5.setPriority(Thread.MAX_PRIORITY);
       t1.setPriority(Thread.MIN_PRIORITY);
       t2.setPriority(Thread.MIN_PRIORITY);
       t3.setPriority(Thread.MIN_PRIORITY);
       t4.setPriority(Thread.MIN_PRIORITY);
       t1.start();
       t2.start();
       t3.start(); 
       t4.start(); 
       t5.start(); 

   }    
}
