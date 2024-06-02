public class DLL {
    int key;
    int val;
    DLL next;
    DLL prev;
    DLL(int key, int val) {
        this.key = key;
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}

class LRU{
    DLL head;
    DLL tail; 

    public void delete_from_kth_pos(){
        DLL temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
    }

    public void insert_at_head(int key, int val){
        DLL temp = new DLL(key, val);
        temp.next = head;
        head.prev = temp;
        head = temp;
    }

    public void remove_from_tail(){
        DLL temp = tail;
        tail = tail.prev;
        tail.next = null;
        temp = null;
    }
}
