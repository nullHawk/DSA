public class RangeSumQuery {
    /*
     *  You are given an integer array A of length N.
        You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
        For each query, you have to find the sum of all elements from L to R indices in A (0 - indexed).
        More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.
    */
    static long[] getPrefixSum(int[] arr){
        long[] prefixSum = new long[arr.length];
        prefixSum[0] = arr[0];
        for(int i = 1; i < arr.length; i++){
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }
        return prefixSum;
    }
    public static long[] rangeSum(int[] A, int[][] B) {
        long[] prefixSum = getPrefixSum(A);
        long[] sum = new long[B.length];
        for(int i = 0; i < B.length; i++){
            int left = B[i][0];
            int right = B[i][1];
            if(B[i][0] == 0){
                sum[i] = prefixSum[right];
            }else{
                sum[i] = prefixSum[right] - prefixSum[left-1];
            }
        }
        return sum;
    }
    public static void main(String[] args){
        int[][] query = {
            {0, 0},
            {1, 2}
        };

        int[] A = {2, 2, 2};

        long[] result = rangeSum(A,query);
        for(long i : result){
            System.out.print(i+" ");
        }
    }
}
