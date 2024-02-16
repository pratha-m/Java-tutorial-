public class insertionSort {
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
        // insertion sort 
        int []arr = {10,1,7,4,8,2,11}; 
        int n=arr.length;    
        for(int i=1;i<n;i++){  
          int temp=arr[i]; 
          int j=i-1;
          while(j>=0){
               if(temp<arr[j]) arr[j+1]=arr[j];
               else break;
               j--;
          }
          arr[j+1]=temp;
        }
        printArray(arr); 
     }
}
