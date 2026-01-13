import java.util.*;

public class Median_of_Two_Sorted_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int m = sc.nextInt();
        int[] b = new int[m];

        
    }
    public static int answer(int[] a, int [] b){
        int n = a.length;
        int m = b.length;
        int[] arr = new int[n+m];
        int c=0;
        for(int i=0 ;i<n ;i++){
            arr[c++] = a[i];
        }
        for(int i=0 ;i<m ;i++){
            arr[c++] = a[i];
        }
        Arrays.sort(arr);
        int l = arr.length;
        if(l % 2 != 0){
            return arr[l/2];
        }else{
            return (arr[l/2-1]+ arr[l/2])/2;
        }

    }
}
