public class mergeSort{
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++) System.out.print(arr[i]+" ");
        System.out.println();
   } 
  public static void merge(int arr[],int s,int e){
    int mid=(s+e)/2; 
    
    int len1=mid-s+1;
    int len2=e-mid;
    
    int first[]=new int[len1];
    int second[]=new int[len2];

    // copy values
    int mainArrayInd=s;
    for(int i=0;i<len1;i++) first[i]=arr[mainArrayInd++];
    mainArrayInd=mid+1;
    for(int i=0;i<len2;i++) second[i]=arr[mainArrayInd++];

    // merge 2 sorted arrays 
    int index1=0;
    int index2=0;
    mainArrayInd=s;
    while(index1<len1 && index2<len2){
        if(first[index1]<second[index2]) arr[mainArrayInd++]=first[index1++];
        else arr[mainArrayInd++]=second[index2++];
    }

    while(index1<len1) arr[mainArrayInd++]=first[index1++];
    while(index2<len2) arr[mainArrayInd++]=second[index2++];

    first=null;
    second=null;
  }  
  public static void mergeSortFunc(int arr[],int s,int e){
    if(s>=e) return;
    int mid=(s+e)/2; 
    // sort left part 
    mergeSortFunc(arr,s,mid);
    //  sort right part 
    mergeSortFunc(arr,mid+1,e);
    // merge 
    merge(arr,s,e);
  }  
  public static void main(String[] args) {
    int arr[]={38,27,43,3,9,82,10};
    int n=arr.length;
    mergeSortFunc(arr,0,n-1);
    printArray(arr);
  }   
}