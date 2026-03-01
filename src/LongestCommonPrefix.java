public class LongestCommonPrefix {
    public static void main(String[] args){
        String[] str={"flower","flow","flight"};
        System.out.println(longestCommonPrefix(str));
    }

    public static String longestCommonPrefix(String[] strs) {
        String result="";

        for(String str:strs){
           for(int i=0;i<str.split("")[0].length();i++){
               System.out.println(str.charAt(i));
           }
        }
        return null;
    }
}
