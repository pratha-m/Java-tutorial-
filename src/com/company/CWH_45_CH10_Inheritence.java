// package com.company;
class Base{
    int x;
    public void printMe(){
        System.out.println("This is a Constructor of base class");
    }
    public void setX(int num){
       System.out.println("I am in Base and Setting x now "); 
       this.x=num;
    }
    public int getX(){
        return x;
    }
}
class Derived extends Base{
      int y;
      public void setY(int num){
         System.out.println("I am in Derived and Setting y now "); 
         this.y=num;
      }
      public int getY(){
        return y;
      }
}
class Animal{
    String animal;
    public void setAnimal(String givenAnimal){
        this.animal=givenAnimal;
    }
    public String getAnimal(){
        return animal;
    }
    public void animalWork(){
        System.out.println("leaving");
    }
}
class Dog extends Animal{
    String dogname;
    public void setDogName(String givenName){
        this.dogname=givenName;
    }
    public String getDogName(){
        return dogname;
    }
    public void dogWork(){
        System.out.println("Bhauuu.......");
    }
}
public class CWH_45_CH10_Inheritence{
    public static void main(String[] args) {
    //    Creating Object of base class 
    //    Base b=new Base();
    //    b.setX(4);
    //    System.out.println(b.getX());

    //    Creating object of derive class 
    //    Derived d=new Derived();
    //    d.setX(19);
    //    System.out.println(d.getX());
    //    d.setY(7);
    //    System.out.println(d.getY());

    // Quick Quiz 
    // Animal a=new Animal();
    // a.setAnimal("camel");
    // System.out.println(a.getAnimal());
    // a.animalWork();
    // System.out.println();
    // Dog d=new Dog();
    // d.setAnimal("Animal1");
    // System.out.println(d.getAnimal()); 
    // d.setDogName("Pitbull");
    // System.out.println(d.getDogName());
    // d.dogWork();
    }
}
