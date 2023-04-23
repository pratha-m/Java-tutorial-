// package com.company;
import java.lang.Math;
import java.util.Scanner;
class GuessNumber{
    private int randNum;
    private int userNum;
    private int count=1;
    Scanner sc=new Scanner(System.in);
    GuessNumber(){ 
       int min=1;
       int max=10; 
       randNum=(int)Math.floor(Math.random()*((max-min+1)+min));  
       System.out.println("Enter Number :");
       takeUserInput(sc.nextInt());
    } 
    public void takeUserInput(int myNum){
       userNum=myNum;
    }
    public void isCorrectNumber(){
         while(userNum!=randNum){
             if(userNum<randNum){
                System.out.println("Entered Number is lesser than given number");
                System.out.println("Enter Number :");
                takeUserInput(sc.nextInt());
             }
             else if(userNum>randNum){
                System.out.println("Entered Number is greater than given number");
                System.out.println("Enter Number :");
                takeUserInput(sc.nextInt()); 
             }
             count++;
         } 
         System.out.println("Numbers are matched user number "+userNum+" and computer number "+randNum);
         System.out.println("****So you guess "+count+" times*****");
    }
    public int getRandom(){
       return randNum;   
    }
    public int getUserNum(){
        return userNum;
    }
}
public class CWH_43_CH9_EX3_GuessNumber {
    public static void main(String[] args) {
        GuessNumber g1=new GuessNumber();
        g1.isCorrectNumber();        
    }
}
