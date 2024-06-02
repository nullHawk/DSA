public class differnceSum {
    //Given a sorted array (Asc) and a number K, check if there eists a pair of element A[i],A[j] such that A[i] - A[j] = k and i!=j
    static boolean pairExists(int[] arr, int k){
        int left = 0;
        int right = 1;
        while(right < arr.length){
            int current_dif = Math.abs(arr[left] - arr[right]);
            if(current_dif == k && left!=right){
                System.out.println(arr[left]+" "+arr[right]);
                return true;
            }
            if(current_dif < k){
                right++;
            }else{
                left++;
            }
            if(left == right){
                right++;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] arr = {-3,0,1,3,6,8,11,14,21,25};
        System.out.println(pairExists(arr, 5));
    }
}

