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
        // 5)automorphic number or not
        // Input  : N = 76 
        // Output : Automorphic
        // Explanation: As 76*76 = 5776
        // Input  : N = 25
        // Output : Automorphic
        // As 25*25 = 625
        // int num=7;
        // int mult=num*num;
        // int temp=num;
        // boolean automorphic=true;
        // while(temp!=0){
        //    if(mult%10!=temp%10) automorphic=false;
        //    temp=temp/10;
        //    mult=mult/10;
        // }
        // if(automorphic) System.out.println("automorphic");
        // else System.out.println("not automorphic");
        // 6)abundant or not 
        // inp->12
        // The divisors of 12 are 1, 2, 3, 4 and 6.
        // The sum of divisors of 12 is 16.
        // 12 < 16. Hence, 12 is an abundant number.
        // Easy 
        // 7)fibb upto n
        // int num=200;
        // int a=0,b=1,c=0;
        // System.out.print(a+" "+b);
        // while(c<num){
        //     c=a+b;
        //     System.out.print(" "+c);
        //     a=b;b=c;
        // }
        // 8)print 
        // * * * * * *
        // *       *
        // *       *
        // *       *
        // * * * * * *
        // int n=5;
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         if(i==0 || i==n-1 || j==0 || j==n-2){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }
        

    }
}