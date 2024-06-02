import java.util.HashSet;

public class Subarray {
    /*
     * Given an array. Write a function which return true if there esxitst a subarry having sum=0
     * 
     * A : 4,2,-3,6 => True
     * B : 1,3,4,2,0,6,7 => True
     * C : 2,4,-2,1,4,-2 => False
     * 
     */
    static boolean isSubZero(int[] arr){
        HashSet<Integer> sums = new HashSet<>();
        int sum = 0;
        for(int i : arr){
            sum+=i;
            if(sum==0 || sums.contains(sum)){
                return true;
            }
            sums.add(sum);
        }
        return false;
    }
    public static void main(String[] args){
        // int[] arr = {4,2,-3,1,6};
        int[] arr = {0,3,4,2,6,7};
        // int[] arr = {2,4,-2,1,4,-2};
        System.out.println(isSubZero(arr));
    }
}
