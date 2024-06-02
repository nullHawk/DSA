public class MaxSumSubarray {

    //Kadens's Algorithm

    public int maxSubArray(final int[] A) {
        int maxSum = A[0];  // Initialize maxSum with the first element of the array
        int currentSum = A[0];  // Initialize currentSum with the first element of the array

        for (int i = 1; i < A.length; i++) {
            currentSum = Math.max(A[i], currentSum + A[i]);
            
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
    
}
