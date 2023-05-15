// import CWH_66_CH12_outsidePackage.CWH_66_innerPackage;
// class C1{
//     public int x=5;
//     protected int y=45;
//     int z=6;
//     private int a=78;
//     public void meth1(){
//         System.out.println(x);
//         System.out.println(y);
//         System.out.println(z);
//         System.out.println(a);
//     }
// }
// class subClass extends C1{
//    public void meth2(){
//      System.out.println(x);
//      System.out.println(y);
//      System.out.println(z);
//     //  System.out.println(a); // gives error becouse private
//    }
// }
// class outPackSubClass extends CWH_66_innerPackage{
//     public void meth3(){
//         // System.out.println(b);
//         // System.out.println(c);
//         // System.out.println(d); // gives error becouse default method not accessible in subclass
//         // System.out.println(e); // gives error becouse private method not accessible in subclass
//     }
// }
// public class CWH_66_CH12_access_modifiers{
//     public static void main(String[] args){
//         // C1 c=new C1();
        
//         // Within class
//         // c.meth1();

//         // Within package
//         // System.out.println(c.x);
//         // System.out.println(c.y);
//         // System.out.println(c.z);
//         // System.out.println(c.a); // gives error becouse we cant use private method within same package 

//         //  Accessing outside packages (world)
//         // CWH_66_innerPackage ci=new CWH_66_innerPackage();
//         // System.out.println(ci.b); 
//         // System.out.println(ci.c); // gives error becouse we cannot use protected methods out of package (world)
//         // System.out.println(ci.d); // gives error becouse we cannot use default(no modifier) methods out of package (world)
//         // System.out.println(ci.e); // gives error becouse we cannot use private methods out of package (world)

//         // subClass access 
//         // subClass cn=new subClass();
//         // cn.meth2();   

//         outPackSubClass os=new outPackSubClass();
//         os.meth3();

//     }
// }
