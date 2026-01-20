package Week_2.Sheet_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Next_Greater_Element_I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //size of array 1
        int m = sc.nextInt();   // size of array 2

        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        for(int i=0 ;i<n ;i++){
            arr1[i] = sc.nextInt();
        }
        for(int i=0 ;i<m ;i++){
            arr2[i] = sc.nextInt();
        }

        int[] res = nextGreaterElement(arr1, arr2);
        for(int a : res){
            System.out.print(a+" ");
        }
        
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] nge = nextGreater(nums2);
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i< nums2.length ;i++){
            map.put(nums2[i], nge[i]);
        }
        int[] ans = new int[nums1.length];
        for(int i=0;i<nums1.length ;i++){
            ans[i] = map.get(nums1[i]);
        }
        return ans;
        
    }

    public static int[] nextGreater(int[] arr){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] nge = new int[n];
        for(int i=n-1 ;i>=0 ;i--){
            while(!st.isEmpty() && st.peek() < arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nge[i] = -1;
            }
            else{
                nge[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return nge;
    }
}
