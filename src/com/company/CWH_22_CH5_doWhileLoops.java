package com.company;
import java.util.Scanner;
public class CWH_22_CH5_doWhileLoops {
   public static void main(String[] args) {
    //    int num1=10;
    //    while(num1<5){
    //       System.out.println(num1);
    //       num1++;
    //    } 

    //    int num2=10;
    //    do{
    //      System.out.println(num2);
    //      num2++;
    //    }while(num2<5);
    
     Scanner sc=new Scanner(System.in);
     int num=sc.nextInt();
     int start=1;
     do{
        System.out.println(start);
        start++;
     }while(start<=num);

    }
}
