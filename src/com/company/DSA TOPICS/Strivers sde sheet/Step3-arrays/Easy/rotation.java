public class rotation{
    public static void reverse(int arr[],int n,int start,int end){
        int i=start;
        int j=end;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;j--;
        }
    }
    public static void main(String[] args) {
        // right rotate array by k place 
        int arr[]={1,2,3,4,5,6,7};
        int d=3,n=arr.length;
        // brute force
        int temp[]=new int[d];
        for(int i=n-d;i<n;i++) temp[i-(n-d)]=arr[i];
        for(int i=d;i>=0;i--) arr[i+d]=arr[i];
        for(int i=0;i<d;i++) arr[i]=temp[i];
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }

        // Optimal 
        reverse(arr,n,0,(n-d)-1);
        reverse(arr,n,n-d,n-1);
        reverse(arr,n,0,n-1);
    
        
    }
}