//package com.company;
public class CWH_31_CH7_Methods{
    static int logic(int x,int y){ 
        int z;
        if(x>y){
           z=x+y;
        }
        else{
            z=(x+y)*5;
        }
        return z;
    }
    static int sum(int a,int b){
        return a+b;
    }
    int multiply(int a,int b){
      return a*b;
    }
    public static void main(String[] args) {
        // int a1=logic(5, 6);
        // System.out.println(a1);
        // int a2=logic(9, 1);
        // System.out.println(a2);
        // int sum1=sum(1,2);
        // System.out.println(sum1);
        
        // METHOD INVOCATION USING OBJET CREATION
        CWH_31_CH7_Methods obj=new CWH_31_CH7_Methods();
        int mult1=obj.multiply(7,8);   
        System.out.println(mult1);
        int mult2=obj.multiply(9,15);
        System.out.println(mult2);
    }
}