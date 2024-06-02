public class printSubsequence {
    //Given an array. Print all subsequence of the away
    static void printAllSubArray(int[] arr){
        int n = arr.length;
        for (int i = 0; i < (1 << n); i++) {
            System.out.print("[ ");
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    System.out.print(arr[j] + " ");
                }
            }
            System.out.println("]");
        }
    }
    public static void main(String[] args){
        int[] arr = {2,5,3,};
        printAllSubArray(arr);
    }
    
}
