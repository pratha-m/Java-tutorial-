import java.util.Scanner;
class InvalidInpExc extends Exception{
    @Override
    public String toString(){
        return "Invalid numbers!";
    }
    @Override
    public String getMessage(){
        return "Invalid numbers!";
    }
}
class NotDevideNumByZero extends Exception{
    @Override
    public String toString(){
        return "We Can not Devide Number by zero!";
    }
    @Override
    public String getMessage(){
        return "We Can not Devide Number by zero!";
    }
}
class VeryLargeNumber extends Exception{
    @Override
    public String toString(){
        return "Very Large Numbers!";
    }
    @Override
    public String getMessage(){
        return "Very Large Numbers!";
    }
}
class MaxMultiplierReached extends Exception{
    @Override
    public String toString(){
        return "Not Multiply That Large Numbers!";
    }
    @Override
    public String getMessage(){
        return "Not Multiply That Large Numbers!";
    }
} 

class Operations{
    public int plusOpn(int num1,int num2){
        return num1+num2;
    }
    public int minusOpn(int num1,int num2){
          return num1-num2;
    }
    public int multOpn(int num1,int num2) throws MaxMultiplierReached{
          if(num1==7000 || num2==7000){
            throw new MaxMultiplierReached();
          }
          return num1*num2;
    }
    public int devideOpn(int num1,int num2){
          return num1/num2;
    }
}
class Calculator extends Operations{
    public int performOperation(int num1,int num2,char operation) throws NotDevideNumByZero,VeryLargeNumber,MaxMultiplierReached,InvalidInpExc{
        if(num1==8 || num2==9){
            throw new InvalidInpExc();
        }
        if(num2==0){
            throw new NotDevideNumByZero();
        }
        if(num1==100000||num2==100000){
            throw new VeryLargeNumber();
        }
        if(operation=='+'){
             return plusOpn(num1,num2);
        }  
        else if(operation=='-'){
             return minusOpn(num1,num2);
        }       
        else if(operation=='*'){
            try{
                return multOpn(num1,num2);
            }
            catch(Exception e){
                throw new MaxMultiplierReached();
            }
        }       
        return devideOpn(num1,num2);
    }    
}
public class CWH_87_CH14_EX6_CustomCalculator {
    public static void main(String[] args) {
        /* Exercise6:You have to create a calculator with following operations:
         + , - , * , /
         which throws following exceptions:
         1.Invalid Exception eg:8 & 9
         2.cannnot devide by zero exception
         3.Max input exception if any of number is greater than 100000
         4.Max Multiplier reached exception - don't allow any input to be greater than 7000 
        */
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Operation To Perform +,-,*,/ :");
        Calculator cal=new Calculator();
        char operation=sc.next().charAt(0);
        if(operation=='+'||operation=='-'||operation=='*'||operation=='/'){
            System.out.println("Enter Two Numbers :");
            try{
                int num1=sc.nextInt();
                int num2=sc.nextInt();
                System.out.println("the "+operation+" of "+num1+" and "+num2+" :"+cal.performOperation(num1,num2,operation)); 
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        else{
            System.out.println("Sorry We Use Only +,-,*,/ operations");
        }
        sc.close();
    }   
}
