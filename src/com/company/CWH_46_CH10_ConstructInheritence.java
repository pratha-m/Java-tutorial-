// package com.company;
class Base1{
    Base1(){
        System.out.println("I am constructor of Base1 class");
    }
    Base1(int a){
        System.out.println("I am an overloaded constructor of Base1 class with value of "+a);
    }
}
class Derived0 extends Base1{
    Derived0(){
        super(0);
        System.out.println("I am a constructor of Derived0 class");
    }
    Derived0(int x,int y){
        super(8);
        System.out.println("I am an overloaded constructor of Derived1 class with value of "+x+" and "+y);
    }
}
class Derived1 extends Base1{
    Derived1(){
        System.out.println("I am a constructor of Derived1 class");
    }
    Derived1(int x,int y){
        System.out.println("I am an overloaded constructor of Derived1 class with value of "+x+" and "+y);
    }
}
class childOfDerived1 extends Derived1{
    childOfDerived1(){
        System.out.println("I am a constructor of child of Derived1 class ");
    }
    childOfDerived1(int x,int y,int z){
        super(x,y);
        System.out.println("I am an overloaded constructor of child of Derived1 class with value of z="+z);
    }
}
public class CWH_46_CH10_ConstructInheritence {
    public static void main(String[] args) {
        // Base1 b=new Base1();
        Derived1 d1=new Derived1();
        // Derived0 d2=new Derived0();
        // Derived1 d3=new Derived1(4,5);
        // Derived0 d4=new Derived0(2,8);
        // childOfDerived1 cd1=new childOfDerived1();
        // childOfDerived1 cd2=new childOfDerived1(1, 2, 3);
    }
}
