import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class prioeityQueu {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(10);
        pq.add(20);
        pq.add(5);
        System.out.println(pq.peek());
        System.out.println(pq.size());
        System.out.println(pq.remove(20));
        System.out.println(pq.peek());
        System.out.println(pq.add(11));
        System.out.println(pq.peek());

    }
    
}
