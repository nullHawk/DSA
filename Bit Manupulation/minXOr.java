import java.util.Arrays;

public class minXOr {
    //Given an array of the integers, Find the pair with minimum xor value.
    
    static int getMinPair(int[] arr){
        Arrays.sort(arr);
        int min_xor = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length - 1; i++) {
            int xor = arr[i] ^ arr[i + 1];
            min_xor = Math.min(min_xor, xor);
        }

        return min_xor;
    }
    public static void main(String[] args){
        int[] arr = {2,3,5,6,7,4};
        System.out.println(getMinPair(arr));
    }
}
