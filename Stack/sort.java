import java.util.ArrayList;
//  class ListNode {
//  *     public int val;
//  *     public ListNode next;
//  *     ListNode(int x) { val = x; next = null; }
//  * }
import java.util.Stack;

public class sort {
    // Given a linked list of integers find the longest palidromic list that exists in that linked list
    public int solve(ListNode A){
        ArrayList<Integer> list = new ArrayList<>();
        while(A!=null){
            list.add(A.val);
            A = A.next;
        }
        int[] arr = new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i] = list.get(i);
        }
        int[] result = getNearestSmallest(arr);
        int max = 0;
        for(int i=0;i<result.length;i++){
            if(result[i]!=-1){
                max = Math.max(max,i-result[i]);
            }
        }
        return max;

    }

    private int[] getNearestSmallest(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            while(!stack.isEmpty() && stack.peek()>=arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                result[i] = -1;
            }else{
                result[i] = stack.peek();
            }
            stack.push(arr[i]);
        }

        return result;

    }
}
