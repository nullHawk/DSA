import java.util.LinkedList;
import java.util.Queue;
public class q {
    //make a function to generate first N number using the digits 1, 2 or 3 only.
    //N = 4
    //1, 2, 3, 11
    static void generate(int n) {
        Queue<String> q = new LinkedList<>();
        q.add("1");
        q.add("2");
        q.add("3");
        for(int i = 0; i < n; i++) {
            String curr = q.poll();
            System.out.print(curr + " ");
            q.add(curr + "1");
            q.add(curr + "2");
            q.add(curr + "3");
        }
    }
    
    public static void main(String[] args) {
        generate(8);
    }

    
}
