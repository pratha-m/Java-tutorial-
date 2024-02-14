public class bubbleSort {
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++) System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static void main(String[] args) {
        int []arr = {64,25,12,22,11};
        int n=arr.length;
        // Normal bubble sort 
        for(int i=1;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[j]>arr[j+1]) swap(arr,j,j+1);
            }
        }
        printArray(arr);
        // Optimized bubble sort 

    }
}
