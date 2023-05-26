interface DemoAno{
     void meth1();
     void meth2();
}
@FunctionalInterface
interface NewDemoAno{
     void meth1(int a);
}

public class CWH_109_CH16_LambdaExpressions {
     public static void main(String[] args) {
          
          // Anonymous class 
          // DemoAno obj=new DemoAno() {
          //      @Override
          //      public void meth1() {
          //          System.out.println("Hello From meth1");
          //      }
          //      @Override
          //      public void meth2() {
          //           System.out.println("Hello From meth2");
          //      }
          // };
          // obj.meth1();

          // Lambda Expressions 
          NewDemoAno obj=(a)->{
               System.out.println("This is method 1 from this lambda with value "+a);
          };
          obj.meth1(6);
     }   
}
