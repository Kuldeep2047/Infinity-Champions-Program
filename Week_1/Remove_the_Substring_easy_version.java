import java.util.*;

public class Remove_the_Substring_easy_version {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        System.out.println(answer(s, t));
    }
    public static int answer(String s, String t){
        int n = s.length();
        int m = t.length();
        int[] left = new int[m];
        int[] right = new int[m];

        // Match from left
        int i = 0;
        for(int j = 0; j < n && i < m; j++){
            if(s.charAt(j) == t.charAt(i)){
                left[i++] = j;
            }
        }

        // Match from right
        i = m - 1;
        for(int j = n - 1; j >= 0 && i >= 0; j--){
            if(s.charAt(j) == t.charAt(i)){
                right[i--] = j;
            }
        }

        int ans = 0;

        //prefix removal
        ans = Math.max(ans, right[0]);

        //suffix removal
        ans = Math.max(ans, n - 1 - left[m - 1]);

        //Middle removal
        for(i = 0; i < m - 1; i++){
            ans = Math.max(ans, right[i + 1] - left[i] - 1);
        }

        return ans;
    }

}

//-> https://codeforces.com/problemset/problem/1203/D1