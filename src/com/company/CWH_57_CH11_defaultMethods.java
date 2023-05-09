interface MyCamera{
    void takeSnap();
    void recordVideo();
    default void record4kVideo(){ // using default keyword we can implement method in interface
        greet();
        System.out.println("recording in 4k");
    }
    default void record10kVideo(){
        System.out.println("Recording 10k video in interface");
    }
    // private method:-
    // we can use private method within the interface
    // it cannot be used by the classes which implements this interface becouse it is private method
    private void greet(){ 
        System.out.println("Good Morning");
    }
}
interface MyWifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting....");
    }
}
class MySmartPhone extends MyCellPhone implements MyCamera,MyWifi{
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
} 
class CWH_57_CH11_defaultMethods{
    public static void main(String[] args) {
        MySmartPhone ms=new MySmartPhone();
        String[] allNetworks=ms.getNetworks();
        for(String item:allNetworks) {
            System.out.println(item);
        }    
        ms.record4kVideo();
        ms.record10kVideo();
        // ms.greet(); //gives error becouse greet is private

    }
}