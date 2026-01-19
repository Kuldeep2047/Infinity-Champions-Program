package Week_2.Sheet_1;

import java.util.Stack;

public class Baseball_Game {
    public static void main(String[] args) {
        String[] opr = {"5","2","C","D","+"};
        System.out.println(answer(opr));
    }
    public static int answer(String[] operations){
        Stack<Integer> st = new Stack<>();
        int sum=0;
        for(int i=0;i<operations.length;i++){
            String ele   = operations[i];
            if (ele.equals("+")) {
                int a = st.pop();
                int b = st.pop();
                st.push(b);
                st.push(a);
                st.push(a + b);
            } else if(ele.equals("D")){
                st.push(2*st.peek());
            }else if(ele.equals("C")){
                st.pop();
            }else{
                st.push(Integer.parseInt(ele));
            }

        }
        while(!st.isEmpty()){
            sum+=st.pop();
        }
        return sum;

    }
}
