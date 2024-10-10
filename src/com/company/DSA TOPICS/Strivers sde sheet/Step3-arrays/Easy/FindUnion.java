import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class FindUnion{
    public static void main(String[] args) {
        // Brute force
        // int arr1[]={-5,-4,-1,1,7};
        // int arr2[]={-3,0,1,8};
        // int n=arr1.length,m=arr2.length;
        // TreeSet<Integer> set=new TreeSet<>();
        // for(int i=0;i<n;i++) set.add(arr1[i]);
        // for(int j=0;j<m;j++) set.add(arr2[j]);
        // System.out.println(set);

        // Optimal
        int arr1[]={-5,-4,-1,1,7};
        int arr2[]={-3,0,1,8};
        int n=arr1.length,m=arr2.length;
        ArrayList<Integer> al=new ArrayList<>();
        int i=0,j=0;
        while(i<n && j<m){
            if(arr1[i]<=arr2[j]){
                if(al.size()==0 || al.get(al.size()-1)!=arr1[i]) al.add(arr1[i++]);
            }
            else if(arr2[j]<arr1[i])
             if(al.size()==0 || al.get(al.size()-1)!=arr2[j]) al.add(arr2[j++]);
        }
        while(i<n) al.add(arr1[i++]);
        while(j<m) al.add(arr2[j++]);
System.out.println(al);
    }
}






