public class hemming_distance {
    //Given an array. For every pair of elements in the array, Count the differnece of bits between pairs , return the sumation of the differnces.
    static int countOfDifs(int[] a){
        // int sum = 0;
        // int n = a.length;
        // int totPerm = n*(n-1)/2;
        // for(int i = 0; i < 32; i++){
        //     int numOf1 = 0;
        //     int numOf0 = 0;
        //     int mask = 1<<i;
        //     for (int num : a) {
        //         if((num&mask) != 0){
        //             numOf1++;
        //         }else{
        //             numOf0++;
        //         }
        //     }
        //     int permOf0 = numOf0*(numOf0-1)/2;
        //     int permOf1 = numOf1*(numOf1-1)/2;
        //     sum += totPerm - (permOf0 + permOf1);
        // }
        // return sum;

        int n = a.length;
        int ans = 0;

        for (int i = 0; i < 32; i++) {
            
            int count = 0;
            for (int j = 0; j < n; j++)
                if ((a[j] & (1 << i)) != 0)
                    count++;
            ans += (count * (n - count) );
        }
        return ans;
    }
    public static void main(String[] args){
        int[] arr = {3,5,6,8};
        System.out.println(countOfDifs(arr));
    }
}
