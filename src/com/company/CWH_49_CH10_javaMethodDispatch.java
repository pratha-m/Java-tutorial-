class Phone{
    public void showTime(){
        System.out.println("Time is 8am");
    }
    public void on(){
        System.out.println("Turning on phone....");
    }
    public void snakeGame(){
        System.out.println("Opening snack game..."); 
    }
}
class SmartPhone extends Phone{
    public void music(){
        System.out.println("Playing Music on SmartPhone....");
    } 
    public void on(){
        System.out.println("Turning on smartPhone....");
    }
}
public class CWH_49_CH10_javaMethodDispatch {
    public static void main(String[] args) {
        // Phone obj1=new Phone(); // Allowed
        // obj1.showTime();  
        // obj1.on();

        // SmartPhone smObj=new SmartPhone(); //  Allowed
        // smObj.showTime();
        // smObj.music();
        // smObj.on();
        
        // Dynamic method dispatch 
        // becouse in below example SmartPhone object is created at run time and decides which method runs
        // Phone obj1=new SmartPhone(); // Allowed (here Phone is reference and SmartPhone is object)
        // obj1.on();   
        // obj1.showTime();
        // obj1.snakeGame();

        // SmartPhone smObj2=new Phone(); // Not Allowed -->gives error 
    }
}
