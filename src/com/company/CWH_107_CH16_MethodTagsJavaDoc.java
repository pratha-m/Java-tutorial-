public class CWH_107_CH16_MethodTagsJavaDoc {
    /**
     * 
     * @param args These arguemnets supplied to the command line
     */
    public static void main(String[] args) {
     System.out.println("I am Main Method");
  }   
  /**
   * Hello This is the method and this is very helpfull method
   * @param i This is first number to add
   * @param j This is second number to add
   * @return sum of two numbers as an integer
   * @throws Exception if i is 0
   * @deprecated This method is deprecated please use + operator
   */
  public int add(int i,int j) throws Exception{
    if(i==0){
        throw new Exception();
    }
    int c;
    c=i+j;
    return c;
  }
}
