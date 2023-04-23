//package com.company;
public class CWH_34_CH7_Recursion {
    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
    static int factorial_iterative(int n){
        int fact=1;
        for(int i=n;i>0;i--){
           fact=fact*i;
        }
        return fact;
    }
    static int fibbLast(int num){
        if(num==0 || num==1){
            return 0;
        }
        if(num==2){
            return 1;
        }
        return fibbLast(num-1)+fibbLast(num-2);
    }
    public static void main(String[] args) {
        //  System.out.println(factorial(5));
        //  System.out.println(factorial_iterative(5));

        // System.out.println(fibbLast(6));
    }
}
