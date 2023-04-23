//package com.company;
public class CWH_25_CH5_PS{
    public static void main(String[] args) {
        // 1)
        // for(int i=1;i<=4;i++){
        //     for(int j=4;j>=i;j--){
        //          System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // 2)
        // int sum=0;
        // int num=10;
        // for(int i=1;i<=num;i++){
        //     sum=sum+2*i;
        // }
        // System.out.println(sum);

        // 3)
        // int num1=5;
        // for(int i=0;i<=10;i++){
        //      System.out.println(num1+"x"+i+"="+(num1*i));
        // }   

        // 4)
        // int num2=7;
        // for(int i=10;i>=0;i--){
        //      System.out.println(num2+"x"+i+"="+(num2*i));
        // }

        // 5)
        // int num3=2;
        // int fact=1;
        // for(int i=1;i<=num3;i++){
        //     fact=fact*i;
        // }
        // System.out.println(fact);

        // 6)
        // int num5=5;
        // int fact=1;
        // int i=1;
        // while(i<=num5){
        //     fact=fact*i;
        //     i++;
        // }
        // System.out.println(fact);

        // 7)
        // int num=4;
        // int i=1;
        // while(i<=num){
        //     int j=num;
        //     while(j>=i){
        //       System.out.print("*");  
        //       j--;
        //     }
        //     i++;
        //     System.out.println();
        // }

        // 9)
        // int num4=5;
        // int sum=0;
        // for(int i=0;i<=num4;i++){
        //     sum=sum+(num4*i);
        // }
        // System.out.println(sum);

        // 11)
         int num=10;
         int sum=0;
         while(num>=1){
             sum=sum+2*num;
             num--;
         }
         System.out.println(sum);
    }
}