//package com.company;
class Example1{  
    int count1=0;
    static int count2=0;
    Example1(){
        count1++;
        count2++;
        System.out.println("non-static variable count1 :"+count1+" and static variable count2 :"+count2);
    }
}
class Example2{  // static method can be called without object and can be called by class name 
     int var1;
     static int var2;
     public int multiply(int a,int b){
          return a*b;
     }
     public static int add(int a,int b){
        return a+b;
     }
}
class Example3{// static variable or method can be accesed from anywhere in class and we call only static variable in static method 
    int a=5;
    static int b=10;
    static void callFunc(){
        System.out.println("this is static variable b in static method :"+b);
    }
    public void newFunc(){
        System.out.println("this is non static variable a in non static public method :"+a);
        System.out.println("this is static variable b in non static public method :"+b);
    }
    Example3(){
        System.out.println("this is non static variable a in constructor :"+a);
        System.out.println("this is static variable b in constructor :"+b);
    }
}
class Example4{
    static int a;
    static int b;
    static{
         System.out.println("First Static Block");
         a=23;
    }
    static{
        System.out.println("Second Static Block");
        b=34;
    }
    static void display2(){
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
    Example4(){
        System.out.println("Calling Constructor value of a and b are :"+a+" "+b);
    }
}
public class CWH_35_CH7_statickeyword {
    static int statVar1;
    int nonStatVar1;
    static void staticCall(){
          System.out.println("Static call without object");  
    }
    void nonStaticCall(){
        System.out.println("Non Static call with object");
    }
    public static void main(String[] args) {
        // Example1 e1=new Example1();
        // Example1 e2=new Example1();
        // Example1 e3=new Example1();

        // Example2 ex1=new Example2();
        // System.out.println(ex1.multiply(10,20));
        // System.out.println(Example2.add(10,20));
        // ex1.var1=10;
        // Example2.var2=20;
        // System.out.println(ex1.var1);  
        // System.out.println(Example2.var2);

        // CWH_35_CH7_statickeyword st1=new CWH_35_CH7_statickeyword();
        // st1.nonStaticCall();  
        // staticCall();
        // st1.nonStatVar1=19;
        // statVar1=20;
        // System.out.println(st1.nonStatVar1);
        // System.out.println(statVar1);

        // Example3 exa1=new Example3();
        // System.out.println(exa1.a);
        // System.out.println(Example3.b);
        // exa1.newFunc();
        // Example3.callFunc();

        // Example4 exam1=new Example4();
        // Example4.display2();



        // SOME IMPORTANT NOTES 
        // Java Static Method 
        // If you apply static keyword with any method, it is known as static method.
        // 1) A static method belongs to the class rather than the object of a class.
        // 2) A static method can be invoked without the need for creating an instance of a class.
        // 3) A static method can access static data member and can change the value of it.

        // Why is the Java main method static?
        // Ans) It is because the object is not required to call a static method. If it were a non-static method, 
        // JVM creates an object first then call main() method that will lead the problem of extra memory allocation.
    }
}
