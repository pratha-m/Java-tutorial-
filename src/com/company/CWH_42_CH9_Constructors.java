// package com.company;
class MyMainEmployee2{
      private int salary;
      MyMainEmployee2(int mySalary){
          salary=mySalary;
      }
      public int getSalary(){
           return salary; 
      }
}
class MyMainEmployee{
    private int id;
    private String name;
    public MyMainEmployee(){
      id=14;
      name="Hello World";
    }
    public MyMainEmployee(String myName,int myId){
      id=myId;
      name=myName;
    }
    public MyMainEmployee(String myName){
      id=1;
      name=myName;
    }
    public MyMainEmployee(int myId){
      id=myId;
      name="new name";
    }
    public String getName(){
          return name;
    }
    public int getId(){
          return id;
    }
}
public class CWH_42_CH9_Constructors {
    public static void main(String[] args) {
      // MyMainEmployee m1=new MyMainEmployee();
      // System.out.println(m1.getId());
      // System.out.println(m1.getName());
      // System.out.println();
      // MyMainEmployee m2=new MyMainEmployee("Pratham",99);
      // System.out.println(m2.getName());   
      // System.out.println(m2.getId());   
      // System.out.println(); 
      // MyMainEmployee m3=new MyMainEmployee("Chhabra");
      // System.out.println(m3.getName());   
      // System.out.println(m3.getId());   
      // System.out.println();
      // MyMainEmployee m4=new MyMainEmployee(89);
      // System.out.println(m4.getName());   
      // System.out.println(m4.getId());   

      // Quick Quiz 
      // MyMainEmployee2 mn2=new MyMainEmployee2(10000);
      // System.out.println(mn2.getSalary());
    }
}
