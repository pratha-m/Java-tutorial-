import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Qn2_longest_k_Unique_Characters_Substring{
    public static boolean satisfyDistinctChars(String s,int k){
        Set<Character> st=new HashSet<>();
        for(int i=0;i<s.length();i++) st.add(s.charAt(i));
        if(st.size()==k) return true;
        else return false;
    }
    public static void main(String args[]){
        // Q2:longest k unique characters substring
        // Method1)TLE
        // String s="aabacbebebe";
        // int k=3;
        // String maxStr="";
        // for(int i=0;i<s.length();i++){
        //     for(int j=i;j<s.length();j++){
        //         String substr=s.substring(i,j+1);
        //         if(satisfyDistinctChars(substr,k)==true && substr.length()>maxStr.length()) maxStr=substr;
        //     }
        // }

        // Method2)
        String s="aabacbebebe";
        int k=5;
        int l=0,r=0;
        int maxLen=0;
        HashMap<Character,Integer> hm=new HashMap<>();
        while(r<s.length()){
            char rch=s.charAt(r);
            hm.put(rch,hm.get(rch)==null?1:hm.get(rch)+1);
            while(hm.size()>k){
                char lch=s.charAt(l);
                hm.put(lch,hm.get(lch)-1);
                if(hm.get(lch)==0) hm.remove(lch);
                l++;
            }
            if(hm.size()<=k) maxLen=Math.max(maxLen,r-l+1);
            r++;
        }
        System.out.println(maxLen);

    }
}