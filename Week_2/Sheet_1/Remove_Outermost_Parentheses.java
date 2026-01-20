package Week_2.Sheet_1;

import java.util.Scanner;

public class Remove_Outermost_Parentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(answer2(s));
    }

    public static String answer2(String s){
        int n = s.length();
        int si =0;
        int ei =0;
        int c =0;
        StringBuilder sb = new StringBuilder();

        for( ; ei <n ; ei++){
            char ch = s.charAt(ei);
            if(ch == '('){
                c++;
            }
            else{
                c--;
            }
            if(c == 0){
                sb.append(s.substring(si+1, ei));
                si = ei+1;
            }
        }

        return sb.toString();
    }
}
