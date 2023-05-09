// package com.company;

// Method1)
// import java.lang.Math;
// import java.util.Scanner;
// class GuessNumber{
//     private int randNum;
//     private int userNum;
//     private int count=1;
//     Scanner sc=new Scanner(System.in);
//     GuessNumber(){ 
//        int min=1;
//        int max=10; 
//        randNum=(int)Math.floor(Math.random()*((max-min+1)+min));  
//        System.out.println("Enter Number :");
//        takeUserInput(sc.nextInt());
//     } 
//     public void takeUserInput(int myNum){
//        userNum=myNum;
//     }
//     public void isCorrectNumber(){
//          while(userNum!=randNum){
//              if(userNum<randNum){
//                 System.out.println("Entered Number is lesser than given number");
//                 System.out.println("Enter Number :");
//                 takeUserInput(sc.nextInt());
//              }
//              else if(userNum>randNum){
//                 System.out.println("Entered Number is greater than given number");
//                 System.out.println("Enter Number :");
//                 takeUserInput(sc.nextInt()); 
//              }
//              count++;
//          } 
//          System.out.println("Numbers are matched user number "+userNum+" and computer number "+randNum);
//          System.out.println("****So you guess "+count+" times*****");
//     }
//     public int getRandom(){
//        return randNum;   
//     }
//     public int getUserNum(){
//         return userNum;
//     }
// }
// public class CWH_43_CH9_EX3_GuessNumber {
//     public static void main(String[] args) {
//         GuessNumber g1=new GuessNumber();
//         g1.isCorrectNumber();        
//     }
// }

// Method2)
// import java.util.Random;
// import java.util.Scanner;
// class Game{
//     public int number;
//     public int inputNumber;
//     public int noOfGuesses=0;
//     Game(){
//         Random rand=new Random();
//         this.number=rand.nextInt(100);
//     }
//     void takeUserInput(){
//         System.out.println("Enter A number :");
//         Scanner sc=new Scanner(System.in);
//         this.inputNumber=sc.nextInt();
//     }
//     boolean isCorrectNumber(){
//         noOfGuesses++; 
//         if(this.inputNumber==number){
//           System.out.println("You guess the correct number it was "+number+" and you guess it in "+noOfGuesses+" Attempts");  
//           return true;
//         }
//         else if(this.inputNumber<number){
//             System.out.println("Sorry Number is less than given number");
//         }
//         else if(this.inputNumber>number){
//             System.out.println("Sorry Number is greater than given number");
//         }
//         return false;
//     }
// }
// public class CWH_43_CH9_EX3_GuessNumber {
//     public static void main(String[] args){
//            Game g=new Game();         
//            boolean b=false;
//            while(!b){
//                g.takeUserInput();
//                b=g.isCorrectNumber();
//            }
//     }
// }
