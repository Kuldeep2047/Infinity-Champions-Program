import java.util.*;

public class Three_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ;i<n ;i++){
            arr[i] = sc.nextInt();
        }
        List<List<Integer>> ans = answer(arr);
        System.out.println(ans);

    }

    public static List<List<Integer>> answer(int[] arr){
        int n = arr.length;
        List<List<Integer>> ans = new ArrayList<>();

        for(int i=0 ;i<n ;i++){
            if(i>0 && arr[i]==arr[i-1]){
                continue;
            }
            int si = i+1;
            int ei = n-1;
            
            while(si<ei){
                int sum = arr[i]+arr[si]+arr[ei];
                if(sum == 0){
                    ans.add(Arrays.asList(arr[i], arr[si], arr[ei]));
                    si++;
                    

                    while(si<ei && arr[si] == arr[si-1]){
                        si++;
                    }
                }
                else if(sum < 0){
                    si++;
                }else{
                    ei--;
                }
            }
        }
        return ans;
    }
}
