// import java.util.ArrayList;

// class MyGeneric<T1>{
//     int val;
//     private T1 t1;
//     public MyGeneric(int val,T1 t1){
//        this.val=val;
//        this.t1=t1;
//     }
//     public int getVal(){
//         return val;
//     }
//     public void setVal(int val){
//         this.val=val;
//     }
//     public T1 geT1(){
//         return t1;
//     }
//     public void setT1(T1 t1){
//         this.t1=t1;
//     }
// }
// class MyGeneric2<T1,T2>{
//     int val;
//     private T1 t1;
//     private T2 t2;
//     public MyGeneric2(int val,T1 t1,T2 t2){
//        this.val=val;
//        this.t1=t1;
//        this.t2=t2;
//     }
//     public int getVal(){
//         return val;
//     }
//     public void setVal(int val){
//         this.val=val;
//     }
//     public T1 geT1(){
//         return t1;
//     }
//     public void setT1(T1 t1){
//         this.t1=t1;
//     }
//     public T2 geT2(){
//         return t2;
//     }
//     public void setT2(T2 t2){
//         this.t2=t2;
//     }
// }
// public class CWH_110_CH16_Generics {
//     public static void main(String[] args) {
//         // ArrayList<Integer> arrayList=new ArrayList<>();
//         // ArrayList<int> arrayList=new ArrayList<>(); // Gives Error becouse primitive datatype not allowed in java
        
//         // MyGeneric<String> g1=new MyGeneric(23, "MyString");
//         // String str=g1.geT1(); 
//         // System.out.println(str);

//         MyGeneric2<String,Integer> g2=new MyGeneric2(77,"hello this is generic",234); 
//         String str1=g2.geT1();
//         Integer int1=g2.geT2();
//         System.out.println(str1+" "+int1);
//         System.out.println(g2.getVal());
//     }
// }
