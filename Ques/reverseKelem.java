import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;

public class reverseKelem {
    //given a queue you need to reverse first K elements of queue
    static Queue<Integer> revK(Queue<Integer> q, int k) {
        Queue<Integer> result = new LinkedList<>();
        Stack<Integer> reverse = new Stack<>();
        for(int i = 0; i < k; i++) {
            reverse.push(q.poll());
        }
        while(!reverse.isEmpty()) {
            result.add(reverse.pop());
        }
        while(!q.isEmpty()) {
            result.add(q.poll());
        }
        return result;
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);
        for(int i : q) {
            System.out.print(i + " ");
        }
        System.out.println();
        q = revK(q, 3);
        for(int i : q) {
            System.out.print(i + " ");
        }
    }
}
