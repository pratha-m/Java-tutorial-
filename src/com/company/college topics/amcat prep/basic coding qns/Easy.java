public class Easy{
    public static int factorial(int num){
        if(num==1) return 1;
        return num*factorial(num-1);
    }
    public static void main(String[] args) {
        // Easy Questions 
        // 1)LCM of two numbers
        // int num1=2,num2=5;
        // int res=Math.max(num1,num2);
        // while(true) {
        //     if(res%num1==0 && res%num2==0) break;
        //     res++;
        // }    
        // System.out.println(res);
        // 2)GCD or HCF of two numbers
        // int num1=20,num2=15;
        // for(int i=Math.min(num1,num2);i>=1;i--){ 
        //   if(num1%i==0 && num2%i==0){
        //     System.out.println(i);
        //     break;
        //   }  
        // }  
        // 3)armstrong or not 
        // int num=123;
        // int len=0;
        // int temp=num;
        // while(temp!=0){
        //     len++;
        //     temp=temp/10;
        // }
        // temp=num;
        // int resNum=0;
        // while(temp!=0){
        //     resNum=resNum+(int)Math.pow(temp%10,len); 
        //     temp=temp/10;
        // }
        // if(resNum==num) System.out.println("Armstrong");
        // else System.out.println("Not Armstrong");
        // 4)strong or not
        // int num=123;
        // int temp=num;
        // int resNum=0;
        // while(temp!=0){
        //     resNum+=factorial(temp%10);
        //     temp=temp/10;
        // }
        // if(resNum==num) System.out.println("Strong");
        // else System.out.println("Not Strong number");
        // 5)
    }
}