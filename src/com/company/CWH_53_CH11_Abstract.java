abstract class Parent2{
    Parent2(){
    System.out.println("Main Parent2 ka constructor hoon");
   }
   public void sayHello(){
    System.out.println("Hello");
   }
   abstract public void greet();
   abstract public void greet2();
}
class Child2 extends Parent2{
    @Override
    public void greet(){
        System.out.println("Good Morning in child2 class");
    }
    @Override
    public void greet2(){
        System.out.println("Good Morning in child2 class greet2 method");
    }
}
abstract class child3 extends Parent2{
    public void th(){
        System.out.println("Good morning in child3 class");
    }
}
public class CWH_53_CH11_Abstract {
    // parent2 p=new Parent2(); //gives error becouse we cannot make object of abstract class
    // Child2 c2=new Child2();
    // child3 c3=new child3(); //gives error becouse we cannot make object of abstract class
}
