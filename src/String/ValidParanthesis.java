package String;
import java.util.*;

public class ValidParanthesis {
    public static void main(String[] args){
        String s="()";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String str) {
        Stack<Character> st=new Stack<>();

        for(char s:str.toCharArray()){
            if(s=='(' || s=='{' || s=='[' ){
                st.push(s);
            }else{
                if (st.isEmpty()) return false;
                if( s==')' && st.pop()!='('){
                    return false;
                }
                if( s=='}' && st.pop()!='{'){
                    return false;
                }
                if(s==']' && st.pop()!='['){
                    return false;
                }

            }
        }
        return st.isEmpty();
    }
}
