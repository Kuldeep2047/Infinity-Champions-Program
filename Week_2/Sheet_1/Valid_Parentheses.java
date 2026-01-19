package Week_2.Sheet_1;

import java.util.*;

public class Valid_Parentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(answer(s));
        
    }
    public static boolean answer(String s){
        int n = s.length();
        Stack<Character> st = new Stack<>();
        for(int i=0 ;i<n ;i++){
            char br = s.charAt(i);
            if(br == '[' || br == '{' || br == '('){
                st.push(br);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                char top = st.pop();
                if((br == ']' && top != '[') || (br == '}' && top != '{') || (br == ')' && top != '(') ){
                    return false;
                }
            }
        }
        return st.isEmpty();

    }
}
