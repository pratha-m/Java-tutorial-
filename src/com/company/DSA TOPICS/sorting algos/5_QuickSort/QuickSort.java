public class QuickSort {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++) System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static int Partition(int arr[],int start,int end){
        int pos=start;
        for(int i=start;i<=end;i++){ 
          if(arr[i]<=arr[end]){
            swap(arr,i,pos);
            pos++;
          }
        }      
        return pos-1;
    }
    public static void quickSort(int arr[],int start,int end){
        if(start>=end) return;
        int pivot=Partition(arr,start,end);
        // left side
        quickSort(arr,start,pivot-1);
        // right side
        quickSort(arr,pivot,end);
    }
    public static void main(String[] args) {
         int arr[]={10,3,4,1,5,6,3,2,11,9};
         quickSort(arr,0,arr.length-1);       
         printArray(arr);
    }
}
