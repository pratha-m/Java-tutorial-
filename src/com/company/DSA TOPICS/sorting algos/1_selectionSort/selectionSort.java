public class selectionSort{
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
        int [] arr = {4,3,2};
        int n=arr.length;

        // Normal selectionSort
        // for(int i=0;i<arr.length-1;i++) for(int j=i;j<arr.length;j++) if(arr[j]<arr[i]) swap(arr,i,j);
        // printArray(arr);

        // Optimized Selection sort
        for(int i=1;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.println(arr[j]+" "+arr[j+1]);
            }
            System.out.println();
        }
        
    }
}