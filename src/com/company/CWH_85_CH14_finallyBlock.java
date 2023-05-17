public class CWH_85_CH14_finallyBlock {
    public static int greet(){
        try{
            int a=50;
            int b=7;
            int c=a/b;
            return c;
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("This is end of this program");
        }
        return 0;
    }
    public static void main(String[] args) {
    //    int k=greet();
    //    System.out.println(k);

    //   int a=7;
    //   int b=10;
    //   while(true){
    //     try{
    //         System.out.println(a/b);
    //     }
    //     catch(Exception e){
    //         System.out.println(e);
    //         break;
    //     }
    //     finally{
    //         System.out.println("I am finally for b = "+b);
    //     }
    //     b--;
    //   }

    // try{
    //    System.out.println(5/0);
    // }
    // finally{
    //    System.out.println("Finally Runn"); 
    // }

    // try{
    //    System.out.println(5/6);
    // }
    // finally{
    //    System.out.println("Finally Runn"); 
    // }

    }
}
