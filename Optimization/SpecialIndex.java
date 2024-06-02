public class SpecialIndex {

    /*
     * Special Index are index after removing all the even indexes equals the sum of oddIndex
     *      0,1,2,3,4,5
     * A : {4,3,2,7,6,-2};
     */

    static int coutnSpecialIndex(int[] arr){
        int specialIndex = 0;
        int[] sumOfEven = new int[arr.length/2];
        int[] sumOfOdd = new int[arr.length/2 + 1];;
        sumOfEven[0] = arr[0];
        sumOfOdd[0] = arr[1];
        for(int i = 1; i < arr.length; i++){
            if(i%2 == 0){
                sumOfEven[i/2]= sumOfEven[(i-1)/2] + arr[i];
            }else{
                sumOfOdd[i/2]= sumOfOdd[(i-1)/2] + arr[i];
            }
        }

        for(int i = 1; i < arr.length ;i++){
            int even=0;
            int odd=0;
            if(i%2==0){
                even = sumOfEven[(i-1)/2] + sumOfOdd[arr.length/2]  - sumOfOdd[i/2];
            }else{
                odd = sumOfOdd[(i-1)/2] + sumOfEven[arr.length/2 - 1] - sumOfEven[i/2];
            }
            if(even == odd){
                System.out.println(i);
                specialIndex++;
            }
        }
        return specialIndex;
    }

    /*
     * Hom
     */

    public static void main(String[] args){
        int[] arr = {4,3,2,7,6,-2};
        System.out.println(coutnSpecialIndex(arr));
    }
}
