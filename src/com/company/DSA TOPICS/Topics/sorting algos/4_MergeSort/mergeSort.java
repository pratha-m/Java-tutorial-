public class mergeSort{
  public static void printArray(int arr[]){
    for(int i=0;i<arr.length;i++) System.out.print(arr[i]+" ");
    System.out.println();
  } 
  public static void merge(int arr[],int start,int mid,int end){
    int temp[]=new int[end-start+1];
    int left=start,right=mid+1,index=0;
    while(left<=mid && right<=end){
       if(arr[left]<=arr[right]) temp[index++]=arr[left++];
       else temp[index++]=arr[right++];
    }
    // copying pending elements of left array to temp array if present
    while(left<=mid) temp[index++]=arr[left++];
    // copying pending elements of left array to temp array if present
    while(right<=end) temp[index++]=arr[right++];
    index=0;
    // copying elements to original array 
    while(start<=end) arr[start++]=temp[index++];
  }
  public static void mergeSortFunc(int arr[],int start,int end){
      if(start==end) return;
      int mid=start+(end-start)/2;
      // left side
      mergeSortFunc(arr,start,mid);
      // right side
      mergeSortFunc(arr,mid+1,end);

      merge(arr,start,mid,end);
   } 
  public static void main(String[] args) {
    int arr[]={6,3,1,2,8,9,10,7,3,10};
    mergeSortFunc(arr,0,arr.length-1);
    printArray(arr);
  }   
}