import java.util.*;

public class Sieve_of_Eratosthenes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(answer(n));
    }
    public static int answer(int n){
        boolean[] arr = new boolean[n];
        Arrays.fill(arr, true);
        arr[0] = false;
        arr[1] = false;
        for(int i=0 ;i*i<=n ;i++){
            if(arr[i] == true){
                for(int j=i*i ;j<n ;j+=i){
                    arr[j] = true;
                }
            }
        }
        int c =0;
        for(boolean a : arr){
            if(a == true){
                c++;
            }
        }
        return c;
    }
}
