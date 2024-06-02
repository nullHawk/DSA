import java.util.Stack;



public class newStackQ{
    public static void main(String[] args){
        newStack s = new newStack();
        s.push(3);
        s.push(4);
        System.out.println(s.getMin());
        s.push(2);
        System.out.println(s.getMin());
        s.push(1);
        System.out.println(s.getMin());
        s.pop();
        System.out.println(s.getMin());
    }
}


//design a new stack which also supports getMin() in O(1) time
class newStack extends Stack<Integer> {
    private Stack<Integer> minStack;

    public newStack() {
        minStack = new Stack<>();
    }

    @Override
    public Integer push(Integer item) {
        if (minStack.isEmpty() || item <= minStack.peek()) {
            minStack.push(item);
        }
        return super.push(item);
    }

    @Override
    public synchronized Integer pop() {
        int popped = super.pop();
        if (popped == minStack.peek()) {
            minStack.pop();
        }
        return popped;
    }

    public int getMin() {
        if (minStack.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return minStack.peek();
    }
}
