package qn_1_printSubsequences_powerset;

import java.util.ArrayList;
import java.util.List;

public class subsequences {
  static List<String> al=new ArrayList<>(); 
  private static void findSubsequences(String str,String ans){
    if(str.length()==0){
        al.add(ans);
        return;
    }
    findSubsequences(str.substring(1),ans+str.charAt(0)); 
    findSubsequences(str.substring(1),ans);
  }
  public static void main(String[] args) {
    String str="abcd";
    findSubsequences(str,"");
    System.out.println(al);
  }   
}