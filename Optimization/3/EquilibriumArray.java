public class EquilibriumArray {

    static int[] getPrefixSum(int[] arr){
        int[] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];
        for(int i = 1; i < arr.length; i++){
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }
        return prefixSum;
    }

    public static int solve(int[] arr){
        int count = -1;
        int[] prefixSum = getPrefixSum(arr);
        if(prefixSum[arr.length-1] - prefixSum[0] == 0){
            count = 0;
        }else if(prefixSum[arr.length-2] == 0){
            count = arr.length - 1;
        }
        for(int i = 1; i < arr.length - 1; i++){
            if(prefixSum[i-1] == prefixSum[arr.length-1] - prefixSum[i]){
                count = i;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] arr = {-7,1,5,2,-4,3,0};
        System.out.println(solve(arr));
    }
    
}
