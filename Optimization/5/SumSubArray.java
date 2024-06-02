public class SumSubArray {
    //TC : O(N)
    //SC : O(1)
    /*
     * Given a Matrix. Find the sumation of all possible submatrices
     * [
     * [1,1]
     * [1,1]
     * ]
     */
    static int sumOfAllSubArray(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i] * (i+1) * (arr.length - i);
        }
        return sum;

    }
    public static void main(String[] args){
        int[] arr = {1,2,3};
        System.out.println(sumOfAllSubArray(arr));
    }

}
