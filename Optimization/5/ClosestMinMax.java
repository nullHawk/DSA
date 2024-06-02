public class ClosestMinMax {
    /*Return the length of smallest subarray which has smallest and the largest element */
    static int getLengthOfSub(int[] A){
        int n = A.length;
        int minValue = A[0];
        for(int i = 1; i < n; i++)
        {
            if(A[i] < minValue)
                minValue = A[i];
        }
        int maxValue = A[0];
        for(int i = 1; i < n; i++)
        {
            if(A[i] > maxValue)
                maxValue = A[i];
        }
    
        int pos_min = -1, pos_max = -1,
            ans = Integer.MAX_VALUE;
    
        for (int i = 0; i < n; i++)
        {
    
            if (A[i] == minValue)
                pos_min = i;
    
            if (A[i] == maxValue)
                pos_max = i;
    
            if (pos_max != -1 && pos_min != -1)
                ans = Math.min(ans, Math.abs(pos_min - pos_max) + 1);
        }
    
        return ans;
    }
    public static void main(String[] args){
        int[] arrr = {2,6,1,6,9};
        System.out.println(getLengthOfSub(arrr));
    }
    
}
