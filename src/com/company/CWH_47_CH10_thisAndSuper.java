class EkClass{
    int a;
    public int getA(){
        return a;
    }
    EkClass(int a){
       this.a=a;
    }
    public int returnone(){
        return 1;
    }
}
class DoClass extends EkClass{
     DoClass(int c){
        super(c);
        System.out.println("Main Ek Constructor Hoon");
     }
}
public class CWH_47_CH10_thisAndSuper {
    public static void main(String[] args) {
        // EkClass e=new EkClass(8);
        // System.out.println(e.getA());
        // DoClass d=new DoClass(5);
    }   
}
