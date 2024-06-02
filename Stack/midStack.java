class StackUsingLinkedlist {
    private class Node {
        int data;
        Node link; 
    }
    Node top;
    Node mid;
    boolean turn = false;
    StackUsingLinkedlist()
    {
        this.top = null;
        this.mid = null;
    }
    // Using this function we will be pushing elements into the stack
    public void push(int x) 
    {
        Node temp = new Node();
        temp.data = x;
        temp.link = top;
        top = temp;
        if(mid == null){
            if(turn){
                mid = temp;
            }
        }
    }
    // Using this function we will be checking whether the stack is empty or not
    public boolean isEmpty()
    {
        return top == null;
    }
    // using this function we will return the top element of the stack
    public int peek()
    {
        if (!isEmpty()) {
            return top.data;
        }
        else {
            System.out.println("Stack is empty");
            return -1;
        }
    }
    // Using this function we will pop the top element of the stack
    public void pop() 
    {
        if (top == null) {
            System.out.print("\nStack Underflow");
            return;
        }
        top = (top).link;
    }
    //return mid and pop it
    int mid(){
        if(mid == null){
            System.out.println("Stack is empty");
            return -1;
        }
        int temp = mid.data;
        mid = mid.link;
        return temp;
    }
    // this function will be used to display the items of the stack
    public void display()
    {
        if (top == null) {
            System.out.printf("\nStack Underflow");
            return;
        }
        else {
            Node temp = top;
            while (temp != null) {
                System.out.printf("%d->", temp.data);
                temp = temp.link;
            }
        }
    }
}

public class midStack extends StackUsingLinkedlist{
    public static void main(String[] args){
        midStack s = new midStack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.display();
        System.out.println();
        System.out.println(s.peek());
        s.display();
        System.out.println();
        System.out.println(s.peek());
        System.out.println(s.mid());
        s.display();
        System.err.println(s.mid());
        s.display();
        System.err.println(s.mid());
        s.display();
    }

}