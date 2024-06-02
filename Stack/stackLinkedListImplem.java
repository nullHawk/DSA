public class stackLinkedListImplem {
    
}

class stack {
    int capacity;
    int top;
    int[] arr;

    stack(int capacity){
        this.capacity = capacity;
        this.arr = new int[this.capacity];
        this.top = 0;
    }
    void push(int element){
        if(this.top >= this.capacity-1){
            System.out.println("Stack overflow");
            return;
        }
        this.top++;
        this.arr[top] = element;
    }

    int pop(){
        if(this.top <= 0){
            return -1;
        }
        int temp = arr[top];
        this.arr[this.top] = 0;
        this.top--;
        return temp;
    }

    int size(){
        return this.top;
    }
    boolean isFull(){
        if(this.top == this.capacity){
            return true;
        }else{
            return false;
        }
    }
}