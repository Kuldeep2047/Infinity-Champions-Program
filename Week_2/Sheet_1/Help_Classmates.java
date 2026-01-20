package Week_2.Sheet_1;

import java.util.Scanner;
import java.util.Stack;

public class Help_Classmates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ;i<n ;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(answer(arr, n));
    }
    public static int[] answer(int[] arr, int n){
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        for(int i= n-1 ;i>=0 ;i--){
            while(!st.isEmpty() && st.peek()>=arr[i] ){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i] = -1;
            }else{
                ans[i] = st.peek();
            }
            
            st.push(arr[i]);
        }
        return ans;
    }
}
