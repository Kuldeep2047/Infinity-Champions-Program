import java.util.*;

public class Median_of_Two_Sorted_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int m = sc.nextInt();
        int[] b = new int[m];
        System.out.println(Binary_Search(a,b));

        
    }
    //using binary search
    public static double Binary_Search(int[] arr1, int[] arr2){
        if(arr1.length > arr2.length){
            return answer(arr2, arr1);
        }
        int m = arr1.length;
        int n = arr2.length;
        int l = 0;
        int r = m;
        while(l<=r){
            int px = (l+r)/2;      //no. of elements from array 1
            int py = (m+n+1)/2 - px;    //no. of elements from array 2

            //left part
            int x1 = px == 0 ? Integer.MIN_VALUE : arr1[px-1];
            int x2 = py == 0 ? Integer.MIN_VALUE : arr2[py-1];
            //right part
            int x3 = px == m ? Integer.MAX_VALUE : arr1[px];
            int x4 = py == n ? Integer.MAX_VALUE : arr2[py];

            //check condition of sorted 
            if(x1<=x4 && x2<=x3){
                //if even length
                if((m+n) % 2 == 0){
                    return (Math.max(x1,x2) + Math.min(x3, x4))/2.0;
                }
                //for odd length median is
                else{
                    return Math.max(x1, x2);
                }
            }
            else if(x1 > x4){
                r = px-1;
            }
            else{
                l = px+1;
            }
        }

        return -1;
    }

    //using brute force 
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
