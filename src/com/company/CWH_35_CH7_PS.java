//package com.company;
public class CWH_35_CH7_PS {
    static void multTable(int num){
       for(int i=1;i<=num;i++){
        System.out.println(num+"x"+i+"="+(num*i));
       }
    }
    static void pattern1(int num){
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static int sum(int num){
        if(num==0){
            return 0;
        }
        return num+sum(num-1);
    }
    static void pattern2(int num){
        for(int i=1;i<=num;i++){
            for(int j=num-i+1;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
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
    static void pattern1_rec(int num){
        if(num>0){
            pattern1_rec(num-1);
            for(int i=0;i<num;i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern2_rec(int num){
        if(num>0){
            for(int i=0;i<num;i++){
                System.out.print("*");
            }
            System.out.println();
            pattern2_rec(num-1);
        }
    }
    static int avg(int ...arr){
        int sum=0,avg;
        for(int ele:arr){
           sum=sum+ele;
        }
        avg=sum/arr.length;
        return avg;
    }
    
    static float CelsToFer(float cel){
        return (float)(cel*1.8);
    }
    static int sumIter(int num){
        int sum=0;
        for(int i=1;i<=num;i++){
            sum=sum+i;
        }
        return sum;
    }
    public static void main(String[] args) {
        // 1)print mult table 
        //   multTable(10);

        // 2)print pattern
        //    pattern1(8);  

        // 3)recursive function to calculate sum of first n natural numbers
        //  System.out.println(sum(5));

        // 4)print pattern
        //  pattern2(5);

        // 5)fibbon
        // System.out.println(fibbLast(6));

        // 6)find average 
        // System.out.println(avg(1));
        // System.out.println(avg(1,2));
        // System.out.println(avg(1,2,3));

        // 7)print 4 pattern using recursion
        // pattern2_rec(10);

        // 8)print 2 pattern using recursion
        // pattern1_rec(5);

        // 9)celcius to ferhen
        // System.out.println(CelsToFer(8.99f));

        // 10)
        // System.out.println(sumIter(5));
    }
}
