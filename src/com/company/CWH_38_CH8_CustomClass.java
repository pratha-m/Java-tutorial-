//package com.company;
class Employee{
    int id;
    String name;
    int salary;
    public void printDetails(){ 
        System.out.println("My id is "+id+" and my name is "+name);
    }
    public int getSalary(){
        return salary;
    }
}
public class CWH_38_CH8_CustomClass {
     public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee obj1=new Employee(); // Instantiating a new Employee object obj1
        Employee obj2=new Employee(); // Instantiating a new Employee object obj2

        // setting attributes for obj1
        obj1.id=1;
        obj1.salary=45;
        obj1.name="pratham";

        // setting attributes for obj2
        obj2.id=2;
        obj2.salary=12;
        obj2.name="name2";

        // printing attributes for obj1
        obj1.printDetails();
        int salary1=obj1.getSalary();
        System.out.println("Salary for "+(obj1.name)+" is :"+salary1);
        System.out.println();

        // printing attributes for obj2
        obj2.printDetails();
        int salary2=obj2.getSalary();
        System.out.println("Salary for "+(obj2.name)+" is :"+salary2);
     }    
}
