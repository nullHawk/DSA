public class SuffixMax {
    public static int[] solve(int[] A) {
        int n = A.length;
        int[] maxArr = new int[n];
        maxArr[n-1] = A[n-1];
        for(int i = n-2; i >= 0; i--){
            if(A[i] > maxArr[i+1]){
                maxArr[i] = A[i];
            }else{
                maxArr[i] = maxArr[i+1];
            }
        }
        return maxArr;
    }
    public static void main(String[] args){
        int[] arr = {12, 5, 6, 7};
        int[] result = solve(arr);
        for(int i : result){
            System.out.print(i + " ");
        }
    }
}
