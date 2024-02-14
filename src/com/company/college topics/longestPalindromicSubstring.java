public class longestPalindromicSubstring{
    public static boolean isPalindrome(String str){
        StringBuilder sb=new StringBuilder(str);
        String rev=sb.reverse().toString();
        return rev.equals(str);
    }
    public static void main(String[] args) {
        // Approach1)Naive Approach
        // String str="abc";
        // String maxSubstr="";
        // for(int i=0;i<str.length();i++){
        //    for(int j=i;j<str.length();j++){
        //      String temp="";
        //      for(int k=i;k<=j;k++){
        //         temp=temp+str.charAt(k);
        //      }
        //      if(isPalindrome(temp) && temp.length()>maxSubstr.length()){
        //         maxSubstr=temp;
        //      }
        //    }
        // }
        // System.out.println(maxSubstr);
        
    }
}