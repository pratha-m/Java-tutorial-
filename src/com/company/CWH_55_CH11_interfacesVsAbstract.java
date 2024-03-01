interface Bicycle{
    int a=45;
    void applyBrake(int decreement);
    void speedUp(int increement);
}
interface HornBicycle{
     public int x=34;
     public int y=98;
     void blowHornFirst();
     void blowHornSecond();
}
class AvonCycle implements Bicycle,HornBicycle{
    public int x=9;
    void blowHorn(){
        System.out.println("Blowing Horn...");
    }
    public void applyBrake(int decreement){
           System.out.println("Applying Break...");
    } 
    public void speedUp(int increement){
           System.out.println("Speeding Up...");  
    }
    public void blowHornFirst(){
        System.out.println("Blowing Horn First..");
    }
    public void blowHornSecond(){
        System.out.println("Blowing Horn Second..");
    }
}
public class CWH_55_CH11_interfacesVsAbstract {
     public static void main(String[] args) {
        
        // AvonCycle ac=new AvonCycle();
        // ac.applyBrake(0);
        // ac.speedUp(2);
        // ac.blowHorn();
        // ac.blowHornFirst();
        // ac.blowHornSecond();
        // System.out.println(ac.x);
        // System.out.println(ac.y);

        // ***all the properties in interfaces are final 

        // you can create properties in interfaces
        // System.out.println(ac.a);

        // you can not modify Properties in interfaces as they are default final 
        // ac.a=23;  // gives error

     }       
}
