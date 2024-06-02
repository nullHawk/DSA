public class TwoSum2{
    //Given a sorted array (Asc) and a number K, check if there eists a pair of element A[i],A[j] such that A[i] + A[j] = k and i!=j
    static boolean pairExists(int[] arr, int k){
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            if(arr[left] + arr[right] == k){
                return true;
            }
            if(arr[left] + arr[right] < k){
                left++;
            }else{
                right--;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] arr = {3,7,8,12,19};
        System.out.println(pairExists(arr, 15));
    }
}
