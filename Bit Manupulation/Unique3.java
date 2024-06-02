public class Unique3 {
    //Given an array where all elements appear thrice exept one element which appear exactly once, Find the single number
    // SC(1)
    public static int findSingleNumber(int[] nums) {
        int result = 0;

        for (int i = 0; i < 32; i++) {
            int sum = 0;

            for (int num : nums) {
                sum += (num >> i) & 1;
            }
            
            if (sum % 3 != 0) {
                result |= (1 << i);
            }
        }

        return result;
    }

    public static void main(String[] args){
        int[] arr = {5,7,5,7,11,11,9,11,7,5};
        System.out.println(findSingleNumber(arr));
    }
    
}
