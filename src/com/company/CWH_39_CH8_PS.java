//package com.company;
// if package contains the more than one class with same name then it gives error
class Employee1{
    int salary;
    String name;
    public int getSalary(){
       return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String newName){
        name=newName; 
    } 
}
class cellPhone{
    public void ring(){
        System.out.println("Ringing......");
    }
    public void vibrate(){
        System.out.println("Vibrating......");
    }
}
class Square{
    int side;
    public void setSide(int newside){
        side=newside;
    }
    public void getSide(){
        System.out.println(side);
    }
    public int sqArea(){
        return side*side;
    }
    public int sqPerimeter(){
        return 4*side;
    }
}
class Rectangle{
    int l;
    int w;
    public void setLenWidth(int newLength,int newWidth){
       l=newLength;
       w=newWidth;     
    }
    public void getLenWidth(){
        System.out.println("Length is "+l+" and Width is "+w);
    }
    public int rectArea(){
        return l*w;
    }
    public int rectPerimeter(){
        return 2*(l+w);
    }
}
class TommyVecetti{
    public void hitting(){
        System.out.println("Hitting....");
    }
    public void running(){
        System.out.println("Running....");
    }
    public void firing(){
        System.out.println("Firing....");
    }
}
class Circle{
    int r;
    public void setRadius(int newRadius){
        r=newRadius;
    }
    public void getRadius(){
        System.out.println(r);
    }
    public float cirArea(){
        return (float)(3.14*r*r);
    }
    public float cirPerimeter(){
        return (float)(2*3.14*r);
    }
}
public class CWH_39_CH8_PS {
    public static void main(String[] args) {
        // 1)
        // Employee1 obj1=new Employee1();
        // obj1.salary=10;
        // obj1.name="Pratham";
        // System.out.println(obj1.getSalary());
        // System.out.println(obj1.name);
        // obj1.setName("chhabra"); 
        // System.out.println(obj1.name);

        // 2)
        // cellPhone c1=new cellPhone();
        // c1.ring();
        // c1.vibrate();

        // 3)
        // Square s1=new Square();
        // s1.setSide(10);
        // s1.getSide(); 
        // int area1=s1.sqArea();
        // System.out.println(area1);
        // int perimeter1=s1.sqPerimeter();
        // System.out.println(perimeter1);
   
        //  4)  
        //  Rectangle r1=new Rectangle();
        //  r1.setLenWidth(10, 20);
        //  r1.getLenWidth();
        //  int areaRect1=r1.rectArea();
        //  System.out.println(areaRect1);
        //  int periRect1=r1.rectPerimeter();
        //  System.out.println(periRect1);          

        // 5)
        // TommyVecetti t1=new TommyVecetti();
        // t1.hitting();
        // t1.running();
        // t1.firing();

        // 6)
        //  Circle c1=new Circle();
        //  c1.setRadius(6);
        //  c1.getRadius();
        //  float areaCir1=c1.cirArea();
        //  System.out.println(areaCir1);
        //  float periCir1=c1.cirPerimeter();
        //  System.out.println(periCir1);
    }
}
