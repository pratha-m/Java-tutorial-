//package com.company;

public class CWH_09_CH2_OPERA_PRECEDENCE {
    public static void main(String[] args) {
//          int a=6*5-34/2; // * and / have same precendence but associativity left to right so evaluation from left to right
          /*
            =30-34/2
            =30-17
            =13
           */
//          int b=60/5-34*2; // / and * have same precendence but associativity left to right so evaluation from left to right
          /*
            =12-34*2
            =12-68
            =-56
           */

//        Quick Quiz
          int x=2,y=6;
          int exp1=(x-y)/2;
          int a=4,b=5,c=9,d=8;
          int exp2=b*b-(4*a*c)/(2*a);
          int v=2,u=1;
          int exp3=v*v-u*u;
          int exp4=a*b-d;
          System.out.println(exp1);
          System.out.println(exp2);
          System.out.println(exp3);
          System.out.println(exp4);
    }
}
