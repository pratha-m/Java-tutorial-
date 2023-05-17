// import java.util.Scanner;

// class exceedIndexException extends Exception{
//    @Override 
//    public String toString(){
//        return "Retries Exceeded 5";
//    }
//    @Override
//    public String getMessage(){
//        return "Retries Exceeded 5";
//    }
// }
// public class CWH_86_CH14_PS {
//      public static void accessElements() throws exceedIndexException{
//         Scanner sc=new Scanner(System.in);
//         int arr[]=new int[3];
//         arr[0]=9;
//         arr[1]=8;
//         arr[2]=7;
//         int count=0;
//         boolean flag=true;
//         while(flag && count<=5){
//             int ind=sc.nextInt();
//             try{
//                 System.out.println("The val is :"+arr[ind]);
//                 break;
//             }
//             catch(ArrayIndexOutOfBoundsException e){
//                System.out.println("Arary index out of bound");
//                count++;
//             }
//         }
//         if(count>5){
//             try{
//                 throw new exceedIndexException();
//             }
//             catch(Exception e){
//               System.out.println(e);
//             }
//         }
//      }
//      public static void main(String[] args) {
//         // 1)
//         // Syntax Error:
//         // int a=5
//         // b=9; 
//         // Logical erorr: 
//         // print odd numbers
//         // for(int i=1;i<5;i++){
//         //     System.out.println(i*2);
//         // } 
//         // Runtime Error: 
//         // int a=6;
//         // int b;
//         // Scanner sc=new Scanner(System.in);
//         // b=sc.nextInt();
//         // System.out.println(a/b); 

//         // 2)
//         // int a=7;
//         // int b;
//         // Scanner sc=new Scanner(System.in);
//         // b=sc.nextInt();
//         // try{
//         //     System.out.println("Index is :"+b);
//         //     System.out.println("Devision is :"+a/b);
//         // }
//         // catch(ArithmeticException e){
//         //     System.out.println("HaHa"); 
//         // }
//         // catch(IllegalArgumentException e){
//         //     System.out.println("HeHe");
//         // }

//         // 3) 4)
//         // Scanner sc=new Scanner(System.in);
//         // int arr[]=new int[3];
//         // arr[0]=9;
//         // arr[1]=8;
//         // arr[2]=7;
//         // int count=0;
//         // boolean flag=true;
//         // while(flag && count<=5){
//         //     int ind=sc.nextInt();
//         //     try{
//         //         System.out.println("The val is :"+arr[ind]);
//         //         break;
//         //     }
//         //     catch(ArrayIndexOutOfBoundsException e){
//         //        System.out.println("Arary index out of bound");
//         //        count++;
//         //     }
//         // }
//         // if(count>5){
//         //     try{
//         //         throw new exceedIndexException();
//         //     }
//         //     catch(Exception e){
//         //       System.out.println(e);
//         //     }
//         // }

//         // 5)
//         // try{
//         //     accessElements();
//         // }
//         // catch(Exception e){
//         //     System.out.println(e);
//         // }
//      }    

// }
