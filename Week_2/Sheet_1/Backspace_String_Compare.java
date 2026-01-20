package Week_2.Sheet_1;

import java.util.Scanner;
import java.util.Stack;

public class Backspace_String_Compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        System.out.println(backspaceCompare(s,t));
    }

    public static boolean backspaceCompare(String s, String t) {
        //get the content of string after perform backspace operation
        Stack<Character> a = get_Stack(s);
        Stack<Character> b = get_Stack(t);

        return a.equals(b);
    }

    public static Stack<Character> get_Stack(String s){
        int n = s.length();
        Stack<Character> st = new Stack<>();

        for(int i=0 ;i<n ;i++){
            char ch = s.charAt(i);
            if(!st.isEmpty() && ch == '#'){
                st.pop();
            }
            if(ch != '#'){
                st.push(ch);
            }
        }

        return st;
    }
}
