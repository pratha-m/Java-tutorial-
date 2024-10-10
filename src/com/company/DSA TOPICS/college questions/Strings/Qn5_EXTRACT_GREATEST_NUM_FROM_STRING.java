public class Qn5_EXTRACT_GREATEST_NUM_FROM_STRING {
    public static void main(String[] args) {
        String str="Thisisalpha5057and97";
        String temp="0";
        int maxNum=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isDigit(ch)) temp+=ch;
            else{
                maxNum=Math.max(maxNum,Integer.parseInt(temp));
                temp="0";
            }  
        }
        maxNum=Math.max(maxNum,Integer.parseInt(temp));
        System.out.println(maxNum);
    }
}
