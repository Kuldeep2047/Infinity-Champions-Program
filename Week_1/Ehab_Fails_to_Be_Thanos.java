import java.util.*;

public class Ehab_Fails_to_Be_Thanos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[2*n];
        for(int i=0; i<2*n ;i++){
            arr[i] = sc.nextInt();
        }
        
        int c =1;
        for(int i=1 ;i<2*n ;i++){
            if(arr[i] == arr[i-1]){
                c++;
            }
        }
        if(c == 2*n){
            System.out.println(-1);
            return;
        }
        Arrays.sort(arr);
        for(int a: arr){
            System.out.print(a+" ");
        }
        

        
    }
}

//-> https://codeforces.com/problemset/problem/1174/a