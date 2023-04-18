package com.company;
public class CWH_33_CH7_VarArgs {
    static int sum(int ...arr){
        //   ...arr worked as int []arr and it stores the arguements as its elements
        int sum=0;
        for(int ele:arr){
            sum=sum+ele;
        }
        return sum;
    }
    static int sum2(int a,int ...arr){
        //   ...arr worked as int []arr and it stores the arguements as its elements
        int sum=a;
        for(int ele:arr){
            sum=sum+ele;
        }
        return sum;
    }
    public static void main(String[] args) {
        // Variable arguements 

        // CASE1
        // System.out.println("The sum of nothing is :"+sum());
        // System.out.println("The sum of 1 is :"+sum(1));
        // System.out.println("The sum of 4 and 5 is :"+sum(4,5));
        // System.out.println("The sum of 4 ,3 and 5 is :"+sum(4,3,5));
        // System.out.println("The sum of 7,3,5 and 2 is :"+sum(7,3,5,2));
        // System.out.println("The sum of 1,9,11,2 and 8 is :"+sum(1,9,11,2,8));

        // CASE2 
        // System.out.println("The sum of 1 is :"+sum2(1));
        // System.out.println("The sum of 4 and 5 is :"+sum2(4,5));
        // System.out.println("The sum of 4 ,3 and 5 is :"+sum2(4,3,5));
        // System.out.println("The sum of 7,3,5 and 2 is :"+sum2(7,3,5,2));
        // System.out.println("The sum of 1,9,11,2 and 8 is :"+sum2(1,9,11,2,8));
    }
}
