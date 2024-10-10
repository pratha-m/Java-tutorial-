public class subarrayWithMaxSum {
    public static void main(String[] args) {
        //  subarry with max sum (kadane's algo)
        // int nums[]={-2,1,-3,4,-1,2,1,-5,4};
        // int sum=0;
        // int maxi=nums[0];
        // for(int i=0;i<nums.length;i++){
        //     sum+=nums[i];
        //     if(sum>maxi) maxi=sum;
        //     if(sum<0) sum=0;
        // }
        // System.out.println(maxi);

        // print subarry with max sum (kadane's algo)
        // int nums[]={-2,1,-3,4,-1,2,1,-5,4};
        // int sum=0;
        // int maxi=Integer.MIN_VALUE;
        // int start=0;
        // int ansStart=-1,ansEnd=-1;
        // for(int i=0;i<nums.length;i++){
        //     if(sum==0) start=i;
        //     sum+=nums[i];
        //     if(sum>maxi) {
        //         maxi=sum;
        //         ansStart=start;
        //         ansEnd=i;
        //     }
        //     if(sum<0) sum=0;
        // }
        // System.out.println("maximum sum :"+maxi);
        // for(int j=ansStart;j<=ansEnd;j++){
        //     System.out.print(nums[j]+" ");
        // }    



    }
}
