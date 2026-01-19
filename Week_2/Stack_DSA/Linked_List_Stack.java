package Week_2.Stack_DSA;

public class Linked_List_Stack {
    static class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node top;
    Linked_List_Stack(){
        top = null;
    }
    

    public void push(int val){
        Node nn = new Node(val);
        nn.next = top;
        top = nn;
    }

    public int pop(){
        if(top == null){
            System.out.println("Stack is Empty...");
            return -1;
        }
        int item = top.data;
        top = top.next;
        return item;
    }

    public int peek(){
        if(top == null){
            System.out.println("Stack is Empty...");
            return -1;
        }
        return top.data;
    }

    public void print(){
        if(top == null){
            System.out.println("Stack is Empty...");
        }
        Node temp = top;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();

    }
        
    
    public static void main(String[] args) {
        Linked_List_Stack st = new Linked_List_Stack();
        st.push(20);
        st.push(30);
        st.pop();
        st.push(40);
        st.push(50);
        st.print();
        System.out.println(st.peek());
    }
}
