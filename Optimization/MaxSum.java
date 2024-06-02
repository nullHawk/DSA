public class MaxSum {
    /*Given an array. Return the maximum subarray sum
     *  A: 2,5,-10, 4, 8, -1, 5, -14,-20, 0
     */

    static int[] getPrefixSum(int[] arr){
        int[] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];
        for(int i = 1; i < arr.length; i++){
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }
        return prefixSum;
    }
    static int maxSum(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        int[] prefixSum = getPrefixSum(arr);
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > maxSum){
                maxSum = arr[i];
            }
            for(int  j = i+1; j < arr.length; j++){
                if(prefixSum[j] - prefixSum[i-1] > maxSum)
                    maxSum+= prefixSum[j] - prefixSum[i-1];
            }
        }
        return maxSum;
    }

     public static void main(String[] args){
        int[] arr = {2,5,-10,4,8,-1,5,-14,-20,0};
        System.out.println(maxSum(arr));
     }
    
}
