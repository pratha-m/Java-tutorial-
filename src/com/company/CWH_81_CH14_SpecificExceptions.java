// import java.util.Scanner;

// public class CWH_81_CH14_SpecificExceptions {
//     public static void main(String[] args) {
//          int []marks=new int[3];        
//          marks[0]=7;
//          marks[1]=56;
//          marks[2]=6;
//          Scanner sc=new Scanner(System.in);
//          System.out.println("Enter Array index");
//          int ind=sc.nextInt();
//          System.out.println("Enter The number you want to devide with");
//          int number=sc.nextInt();
//          try{
//              System.out.println("The Value at array index entered is "+marks[ind]);
//              System.out.println("The value of array value devide by number is "+marks[ind]/number);
//          }
//          catch(ArithmeticException e){
//             System.out.println("Arithmetic Exception Occured");
//          }
//          catch(ArrayIndexOutOfBoundsException e){
//             System.out.println("Array index out of bound Exception Occured");
//          }
//          catch(Exception e){
//             System.out.println("Some Other Exception Occured");
//          }
//     }
// }
