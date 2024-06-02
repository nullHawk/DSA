import java.util.Collections;
import java.util.PriorityQueue;

public class slidingwindoesMax {
    //given an array with n numbers, return another array where each index contains the max element in the window of size k
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(k == 1){
            return nums;
        }
        int[] result = new int[nums.length - k+1];
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        int i = 0;
        for(; i < k; i++){
            pq.add(nums[i]);
        }
        result[0] = pq.peek();
        pq.remove(nums[0]);
        for(int j = 1; i < nums.length && j < result.length; i++, j++){
            pq.add(nums[i]);
            result[j] = pq.peek();
            pq.remove(nums[i-k+1]);
        }
        return result;
    }
    
}
