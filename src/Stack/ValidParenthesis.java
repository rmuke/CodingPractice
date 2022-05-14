package Stack;

import java.util.Stack;

public class ValidParenthesis {

    public static void main(String[] args) {

        String str = "{}";
        System.out.println(isValidParenthesis(str));

    }

    public static boolean isValidParenthesis(String s){
        Stack<Character> st = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch == '{'){
                st.push('}');
            }else if(ch == '['){
                st.push(']');
            }else if(ch == '('){
                st.push(')');
            }else if(st.isEmpty() || ch != st.pop()){
                return false;
            }
        }
        return st.isEmpty();
    }
}
