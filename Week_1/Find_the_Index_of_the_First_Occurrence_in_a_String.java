import java.util.*;
public class Find_the_Index_of_the_First_Occurrence_in_a_String{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String needle = sc.next();
        System.out.println(answer(str, needle));

    }
    public static int answer(String str, String needle){
        int idx =-1;
        for(int i=0 ;i<str.length()- needle.length() ;i++){
            if(str.substring(i,i+needle.length()).equals(needle)){
                idx = i;
                break;
            }
        }
        return idx;
    }
}