class A{
    public int a;
    public int method1(){
        return 4;
    }
    public void method2(){
        System.out.println("I am Method2 of class A");
    }
}
class B extends A{
    @Override // optional but recommended
    public void method2(){
        System.out.println("I am Method2 of class B");
    }
    public void method3(){
        System.out.println("I am Method3 of class B");
    }
}
public class CWH_48_CH10_methodOverriding {
   public static void main(String[] args) {
    //   A a=new A();
    //   a.method2(); 

    //   B b=new B();
    //   b.method2();
    //   b.method3();
   }    
}
