public class OrofOr {
    //Given an array.Find the OR of OR o all possible subarrays
    static int getCumulativeOr(int[] arr){
        int or = arr[0];
        for(int i = 1; i < arr.length; i++){
            or |= arr[i];
        }
        return or;
    }
    
}
