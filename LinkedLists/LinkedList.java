class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
class LinkedList{
    Node head;

    public LinkedList(){
        this.head = null;
    }

    public void append(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }

        Node last = head;
        while(last.next != null){
            last.next = newNode;
        }

        last.next = newNode;
    }

    public void display(){
        Node current = head;
        while (current != null){
            System.out.println(current.data + " ");
            current  = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args){
        LinkedList linkedList = new LinkedList();

        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);

        // Displaying the linked list
        System.out.println("Linked List: ");
        linkedList.display();
    }
}