import java.util.Stack;
 //design a que using stack
    /*
     * enque() : 
     * deques() :
     * front() : peek
     */

class Queue {
   
    //design que using stack
    Stack<Integer> head = new Stack<>();
    Stack<Integer> tail = new Stack<>();
    void enque(int x) {
        head.push(x);
    }
    int deque() {
        if(head.isEmpty() && tail.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        if(tail.isEmpty()) {
            while(!head.isEmpty()) {
                tail.push(head.pop());
            }
        }
        return tail.pop();
    }
    int front() {
        if(head.isEmpty() && tail.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        if(tail.isEmpty()) {
            while(!head.isEmpty()) {
                tail.push(head.pop());
            }
        }
        return tail.peek();
    }

}

public class stackqueu {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enque(10);
        q.enque(20);
        q.enque(30);
        q.enque(40);
        q.enque(50);
        q.enque(60);
        q.enque(70);
        q.enque(80);
        //print queue
        for(int i : q.head) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(q.deque());
        System.out.println(q.deque());
    }
}
