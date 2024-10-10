public class Qn3_SUM_NUMS_STRING {
    public static void main(String[] args) {
        String str="1abc23";
        int i=0;    
        int sum=0;
        String numStr="0";
        while(i<str.length()){
            char itrCh=str.charAt(i);
            if(Character.isDigit(itrCh)) numStr+=itrCh;
            else{
                sum+=Integer.parseInt(numStr);
                numStr="0";
            }
            i++;
        }
        System.out.println(sum+Integer.parseInt(numStr));
    }
}
