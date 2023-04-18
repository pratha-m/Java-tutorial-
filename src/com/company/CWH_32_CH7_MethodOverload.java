package com.company;
public class CWH_32_CH7_MethodOverload{
    static void foo(){
        System.out.println("Good Morning Bro!");
    }
    static void foo(int a){
        System.out.println("Good Morning "+a+" Bro!");
    }
    static void foo(int a,int b){
        System.out.println("Good Morning parameter1 "+a+" and parameter2 "+b);
    }
    static void change(int a){
        a=98;
    }
    static void change2(int []arr){
        arr[0]=98;
    }
    static void tellJoke(){
        System.out.println("This is the joke");
    } 
    public static void main(String[] args) {
        // tellJoke();
        
        // CASE1:Changing the integer (integer never change) 
        // int x=45;
        // change(x);
        // System.out.println(x); 

        // CASE2:Changing the array (array changed)
        // int []marks={52,73,77,89,98,94}; // creates an array object where marks is an reference(means address in memory)
        // change2(marks); // we passed marks here which is a reference (means address in memory)
        // System.out.println(marks[0]);

        // Method Overloading 
        // foo();
        // foo(200);
        // foo(899,567);
    }
}