class NegativeRadiusException extends Exception{
    @Override
    public String toString() {
        return "Radius Can not be negative";
    }
    @Override
    public String getMessage() {
        return "Radius Can not be negative";
    }
}
public class CWH_84_CH14_ThrowVsThrows {
   public static double area(int r) throws NegativeRadiusException{ // it tells that this area() function can throw exception so handle it
        if(r<0){
            throw new NegativeRadiusException();
        }
        double result=Math.PI*r*r;
        return result;
   } 
   public static int devide(int a,int b) throws ArithmeticException{
     // Made By pratham
      int result=a/b;
      return result;
   } 
   public static void main(String[] args) {
      // shivam - uses devide function created by pratham
      try{
          int c=devide(6,0);    
          System.out.println(c);
      }
      catch(Exception e){
          System.out.println("Exception Occured");
      }

      try{
          double ar=area(1);
          System.out.println(ar);
      }
      catch(Exception e){
        System.out.println(e);
      }

   }    
}
