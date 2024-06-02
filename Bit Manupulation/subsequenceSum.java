public class subsequenceSum {
    static boolean containsSubsequenceSum(int[] arr, int sum){
        for(int i = 0; i < 1<<arr.length; i++){
            int tempSum = 0;
            for(int j = 0; j <arr.length; j++){
                if ((i & (1 << j)) > 0) {
                    tempSum += arr[j];
                }
            }
            if(tempSum == sum){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        
    }
}
