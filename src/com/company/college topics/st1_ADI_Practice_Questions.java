import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;

public class st1_ADI_Practice_Questions {
    public static void main(String[] args) {
        // Sort 
        // 1-->sort first 3 elements 
        // 2-->sort form mid to last
        // 3-->sort last 3 digits
        // Scanner sc=new Scanner(System.in);
        // int size=sc.nextInt();
        // int arr[]=new int[size];
        // for(int i=0;i<size;i++){
        //     arr[i]=sc.nextInt();
        // }
        // int inp=sc.nextInt();
        // if(inp==1){
        //     Arrays.sort(arr,0,3);
        // }
        // else if(inp==2){
        //     Arrays.sort(arr,(size/2),(size/2)+3);
        // }
        // else if(inp==3){
        //     Arrays.sort(arr,size-3,size); 
        // }
        // for(int i=0;i<size;i++){
        //     System.out.print(arr[i]+" ");
        // }

        // count the triangles
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        } 
        Arrays.sort(arr);
        int ele=0;
        int maxCount=0;
        for(int i=0;i<size;i++){
            int count=0;
            for(int j=i+1;j<size;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(arr[i]>ele && count>=3 && count/3>maxCount){
                maxCount=count/3;
                ele=arr[i];
            }
        }
        System.out.println(ele);
        System.out.println(maxCount);
    }
}
