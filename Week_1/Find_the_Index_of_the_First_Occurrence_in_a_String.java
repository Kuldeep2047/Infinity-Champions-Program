import java.util.*;
public class Find_the_Index_of_the_First_Occurrence_in_a_String{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String needle = sc.next();
        System.out.println(answer(str, needle));

    }
    public static int answer(String s, String sub){
        int n = s.length();
        int m = sub.length();

        // int idx =-1;
        for(int i=0 ;i<=n - m ;i++){
            if(sub.equals(s.substring(i,i+m))){
                return i;
            }
        }
        return -1;
    }
}