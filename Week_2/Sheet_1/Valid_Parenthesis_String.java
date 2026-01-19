package Week_2.Sheet_1;

import java.util.Scanner;

public class Valid_Parenthesis_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(valid_parenthesis(s));
    }

    public static boolean valid_parenthesis(String s){
        int n = s.length();
        int minOpen =0;
        int maxOpen = 0;
        for(int i=0 ;i<n ;i++){
            char ch = s.charAt(i);
            if(ch == '('){
                minOpen++;
                maxOpen++;
            }
            else if(ch == ')'){
                minOpen--;
                maxOpen--;
            }
            else{
                //if we take (
                minOpen--;
                //if we take )
                maxOpen++;
            }
            if(minOpen < 0){
                minOpen = 0;
            }
            if(maxOpen < 0){
                return false;
            }
        }
        return minOpen == 0;
    }
}
