public class ProbGoogle {
    /*
     * Given an array of size N having all 0's.
     * Q quries.
     * index    value
     * add the value to all the elements greater than or equal to the index.
     */
    static int[] getPrefixSum(int[] arr){
        int[] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];
        for(int i = 1; i < arr.length; i++){
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }
        return prefixSum;
    }

    static int[] getResultArr(int[] arr, int[][] q){
        for(int i = 0 ; i < q.length; i++){
            int index = q[i][0];
            int value = q[i][1];
            arr[index] = value;
        }
        arr = getPrefixSum(arr);
        return arr;
    }

    static int[] prob2(int[] arr, int[][]q){
        for(int i = 0 ; i < q.length; i++){
            int startIndex = q[i][0];
            int endIndex = q[i][1];
            int value = q[i][2];
            arr[startIndex] = value;
            arr[endIndex+1] = -value;
        }
        arr = getPrefixSum(arr);
        return arr;
    }
    public static void main(String[] args){
        int[][] query = {
            {5,1},
            {6,3},
            {1,5},
            {3,-1},
            {0,1},
        };
        int[] arr = {0,0,0,0,0,0,0,0};
        int[] result = getResultArr(arr, query);
        for(int i : result){
            System.out.print(i+" ");
        }
    }
    
}
