package Week_2.Stack_DSA;

public  class stack_using_array {
    static class Stack{
        int top =-1;
        int capacity;
        int[] arr;

        Stack(int n){
            capacity = n;
            arr = new int[n];
        }

        public void push(int val){
            if(top == capacity){
                System.out.println("Stack is full...");
                return;
            }
            arr[++top] = val;
        }
        public int pop(){
            if(isEmpty()){
                System.out.println("Stack is Empty...");
                return -1;
            }
            return arr[top--];
        }
        public int peek(){
            if(isEmpty()){
                System.out.println("Stack is Empty...");
                return -1;
            }
            return arr[top];
        }

        public boolean isEmpty(){
            if(top == -1){
                return true;
            }
            return false;
        }
        public void print(){
            if(isEmpty()){
                System.out.println("Stack is Empty...");
                return;
            }
            int idx = top;
            for( ;idx>=0 ;idx--){
                System.out.print(arr[idx]+" ");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        // stack s= new stack();
        Stack st = new Stack(5);
        st.push(1);
        st.push(12);
        st.pop();
        st.push(14);
        st.push(31);
        st.print();
        System.out.println(st.peek());

    }
}
