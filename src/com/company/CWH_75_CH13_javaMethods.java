// class MyNewThr1 extends Thread{
//     public void run(){
//         int i=0;
//         while(i<=20){
//             System.out.println("This is Thread 1"); 
//             i++;
//         }
//     }
// }
// class MyNewThr2 extends Thread{
//     public void run(){
//         int i=0;
//         while(i<=20){
//             System.out.println("This is Thread 2"); 
//             i++;
//         }
//     }
// }
// class MyNewThr3 extends Thread{
//     public void run(){
//         int i=0;
//         while(i<=20){
//             System.out.println("This is Thread 3"); 
//             try{
//                Thread.sleep(500);
//             }
//             catch(Exception e){
//                System.out.println(e); 
//             }
//             i++;
//         }
//     }
// }
// public class CWH_75_CH13_javaMethods {
//     public static void main(String[] args) {
//         MyNewThr1 t1=new MyNewThr1();
//         MyNewThr2 t2=new MyNewThr2();
//         MyNewThr3 t3=new MyNewThr3();
//         // JOIN --> it waits for first thread to complete execution (we use try catch block becouse join() can gives
//         // exception becouse its previous thread may already killed(exit) )

//         // t1.start();
//         // t2.start();

//         // t1.start();
//         // try{
//         //     t1.join();
//         // }
//         // catch(Exception e){
//         //     System.out.println(e);
//         // }
//         // t2.start();

//         // t3.start();
//         // t2.start();

//         // t3.start();
//         // try{
//         //     t3.join();
//         // } 
//         // catch(Exception e){
//         //     System.out.println(e);
//         // }
//         // t2.start();

//         // System.out.println(t1.isDaemon());
//         // System.out.println(t2.isDaemon());
//         // System.out.println(t3.isDaemon());

//         // System.out.println(t1.isAlive());
//         // System.out.println(t2.isAlive());
//         // System.out.println(t3.isAlive());

//         // t1.start();
//         // t1.interrupt();
//         // t1.start();

//         // System.out.println(t1.toString());
//         // System.out.println(t2.toString());
//         // System.out.println(t3.toString());
//     }  
// }
