import java.util.HashMap;
import java.util.Map;

class Node {
    public int val;
    public Node next;
    public Node random;
    public Node(int x) { val = x; next = null; random = null; }
}
public class q1 {
    //Given a linked list with a next pointer and a random pointer, make a copy of this linked list
    // try to solve this with O(1) space complexity
    public Node copyRandomList(Node head) {
        if (head == null)
            return null;
        if (map.containsKey(head))
            return map.get(head);

        Node newNode = new Node(head.val);
        map.put(head, newNode);
        newNode.next = copyRandomList(head.next);
        newNode.random = copyRandomList(head.random);
        return newNode;
    }
    private Map<Node, Node> map = new HashMap<>();


    public static void main(String[] args){
        q1 sol = new q1();
        Node head = new Node(1);
        Node node1 = new Node(2);
        Node node2 = new Node(3);
        head.next = node1;
        node1.next = node2;

        Node newHead = sol.copyRandomList(head);
        while (newHead != null){
            System.out.println(newHead.val);
            newHead = newHead.next;
        }
    }

}
