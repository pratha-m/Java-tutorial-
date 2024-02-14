public class bitmasking{
    public static void main(String[] args) {
    // odd or even
    //   int n=67;
    //   System.out.println(isOdd(n));

    // find unique
    // int arr[]={2,3,4,1,2,1,3,6,4};
    // System.out.println(unique(arr));

    // find ith bit of number 
    // int n=9;
    // int i=4;
    // int remainBits=n>>i-1;
    // int ithBit=remainBits & 1;
    // System.out.println(ithBit);

    // set the ith bit of number 
    // int n=86;
    // int i=4;
    // int mask=1<<i-1;
    // int setIth=n | mask;
    // System.out.println(setIth);

    // reset ith bit  -- doubt
    // int n=86;
    // int i=5;
    // int mask=~(1<<i-1);
    // int resetIth=n & mask;
    // System.out.println(resetIth);

    // find position of right most set bit
    // int n=12;
    // int place=0;
    // while(n!=0){
    //     place++;
    //     if((n&1)==1){
    //         break;
    //     }
    //     n=n>>1;
    // }
    // System.out.println(place);

    // unique number from array 
    // int arr[]={2,2,3,2,7,7,8,7,8,8};
    // int sum=0;
    // System.out.println();
    // for(int i=0;i<arr.length;i++){
    //    sum=sum+Integer.parseInt(Integer.toBinaryString(arr[i]));
    // }
    // String str="";
    // while(sum!=0){
    //     int r=sum%10;
    //     str=str+r%3;
    //     sum=sum/10;
    // }
    // StringBuilder newStr=new StringBuilder(str);
    // int i=newStr.length()-1;
    // int unique=0;
    // while(i>=0){
    //    unique=unique+((int)Math.pow(2,newStr.length()-1-i)*(newStr.charAt(i)=='1'?1:0)); 
    //    System.out.println(unique);
    //    i--;
    // }
    // System.out.println(unique);

    // Find nth magic number 
    // int n=5;
    // int magicNum=0;
    // int ind=1;
    // while(n!=0){
    //    magicNum=magicNum+(n&1)*(int)Math.pow(5,ind);
    //    n=n>>1;
    //    ind++;
    // }
    // System.out.println(magicNum);

    // count bits in number
    // int n=10;
    // int b=2;
    // int noDigits=(int)(Math.log(n)/Math.log(b))+1;
    // System.out.println(noDigits);

    // Q12)if power of 2 or not
    // Method1)me
    // int n=6;
    // int temp=n;
    // int count=0;
    // while(n!=0){
    //     if((n&1)==1){
    //       count++;
    //     }
    //     n=n>>1;
    // }
    // if(count==1){
    //     System.out.println(temp+" is power of 2");
    // }
    // else{
    //     System.out.println(temp+" is not power of 2");
    // }
    // Method2)
    // int n=2;
    // boolean isPowerOfTwo=(n&(n-1))==0;
    // if(n==0){
    //     isPowerOfTwo=false;
    // }
    // System.out.println(isPowerOfTwo); 

    // Q13)Power of a number
    // int base=2;
    // int power=4;
    // int ans=1;
    // while(power>0){
    //     if((power&1)==1){
    //         ans*=base;
    //     }
    //     base*=base;
    //     power=power>>1;
    // }
    // System.out.println(ans);

    // Q14)Count set bits
    // int n=45;
    // System.out.println(Integer.toBinaryString(n));
    // // System.out.println(setBitsMeth1(n));
    // System.out.println(setBitsMeth2(n));

    // Q16)XOR of all numbers b/w a and b
    // Meth1)Good
    // range xor for a,b=xor(b)^xor(a-1)
    int a=3;
    int b=9;
    int ans=xor(b)^xor(a-1);
    System.out.println(ans); 
    // Meth2)give TLE for large numbers
    // int ans2=0;
    // for(int i=a;i<=b;i++){
    //    ans2^=i;
    // }
    // System.out.println(ans2);



    }
    // xor from 0 to a
    static int xor(int a){
      if(a%4==0){
        return a;
      }
      if(a%4==1){
        return 1;
      }
      if(a%4==2){
        return a+1;
      }
      return 0;
    }
    private static int setBitsMeth1(int n){
       int count=0;
       while(n>0){
         count++; 
         n-=(n & -n);
       }
       return count;
    }
    private static int setBitsMeth2(int n){
       int count=0;
       while(n>0){
         count++; 
         n=n&(n-1);
       }
       return count; 
    }
    private static boolean isOdd(int n){
       return (n&1)==1;
    }
    private static int unique(int arr[]){
        int unique=0;
        for(int n:arr){
             unique=unique^n;
        }
        return unique;
    }
} 