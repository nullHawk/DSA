import java.util.Arrays;

public class Zomato {
    static int sum(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum+= arr[i];
        }
        return sum;
    }

    static int[] getPrefixSum(int[] arr){
        int[] prefixSum = new int[arr.length];
        int n = arr.length;
        prefixSum[n-1] = arr[n-1];
        for(int i = n-2; i >= 0 ; i--){
            prefixSum[i] = prefixSum[i+1] + arr[i];
        }
        return prefixSum;
    }

    public static void main(String[] args){
        int[] arr = {2, 1, 4};
        Arrays.sort(arr);
        getPrefixSum(arr);


    }
    
}
