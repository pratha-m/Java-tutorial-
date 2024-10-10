import java.util.ArrayList;
import java.util.List;

public class printPermutations {
    public static void generatePermut(int arr[],List<List<Integer>> ans,List<Integer> ds,boolean freq[]){
        if(ds.size()==arr.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(freq[i]==false){
                freq[i]=true;
                ds.add(arr[i]);
                generatePermut(arr,ans,ds,freq);
                ds.remove(ds.size()-1);
                freq[i]=false;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        boolean freq[]=new boolean[arr.length];
        generatePermut(arr,ans,ds,freq);
        System.out.println(ans);
    }
}
