interface MyCamera2{
    void takeSnap();
    void recordVideo();
    default void record4kVideo(){ // using default keyword we can implement method in interface
        greet();
        System.out.println("recording in 4k");
    }
    default void record10kVideo(){
        System.out.println("Recording 10k video in interface");
    }
    private void greet(){ 
        System.out.println("Good Morning");
    }
}
interface MyWifi2{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class MyCellPhone2{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting....");
    }
}
class MySmartPhone2 extends MyCellPhone2 implements MyCamera2,MyWifi2{
    public void takeSnap(){
        System.out.println("Taking Snap");
    }
    public void recordVideo(){
        System.out.println("Recording Video");
    }
    public String[] getNetworks(){
        System.out.println("Getting list of networks");
        String[] networkList={"pratham","chhabra","redmi","Xiomi"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting To "+network);
    }
    public void record10kVideo(){
        System.out.println("Recording 10k video in class");
    }
    public void sampleMeth(){
        System.out.println("meth");
    }
} 
public class CWH_59_CH11_polymorphismInInterfaces {
   public static void main(String[] args) {
    // MyCamera2 cam1=new MySmartPhone2(); // this is a smartPhone but use it as a camera
    // cam1.getNetworks(); // gives error becouse getNetworks() is not in MyCamera2 interface
    // cam1.sampleMeth(); // gives error becouse sampleMeth() is not in MyCamera2 class
    // cam1.takeSnap();
    // cam1.recordVideo();
    // cam1.record4kVideo();
    // cam1.record10kVideo();

    // MySmartPhone2 s=new MySmartPhone2();
    // s.sampleMeth();
    // s.recordVideo();
    // s.pickCall();
    // s.getNetworks();
    // s.callNumber(12344);
   }      
}
