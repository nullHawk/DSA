
//Given an array of the numbers. Return the max '&' value of any pair i.e return (A[i] & A[j]) (i!=j)

public class maxAnd {
    static int checkBit(int pattern, int arr[], int n){
        int count = 0;
        for (int i = 0; i < n; i++)
            if ((pattern & arr[i]) == pattern)
                count++;
        return count;
    }
    static int getMaxAnd(int[] arr){
        int res = 0, count;
        int n = arr.length;

        for (int bit = 31; bit >= 0; bit--) {
       
            count = checkBit(res | (1 << bit), arr, n);
 
            if (count >= 2){}
                res |= (1 << bit);
                // TODO : 
        }
 
        return res;
    }
    public static void main(String[] args){
        int[] arr = {26,13,23,28,27,7,25};
        System.out.println(getMaxAnd(arr));
    }
}
