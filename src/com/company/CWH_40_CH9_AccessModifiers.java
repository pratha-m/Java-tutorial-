// package com.company;
class myEmployee{
   private int id;
   private String name;
   public void setName(String givenName){
         this.name=givenName;
   }
   public void setid(int givenId){
         this.id=givenId;
   }
   public String getName(){
         return name;
   }
   public int getId(){
         return id;
   }
}
public class CWH_40_CH9_AccessModifiers {
    public static void main(String[] args) {
        myEmployee m1=new myEmployee();
        // m1.id=10; // gives error becouse id is private
        // m1.name="pratham"// gives error becouse name is private
        m1.setName("pratham");
        m1.setid(10);
        System.out.println(m1.getName());
        System.out.println(m1.getId());
    }
}
