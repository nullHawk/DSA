public class PrefixMax {
    /*
     *  Kamal is a software developer and he's working on a new feature for an e-commerce website. The website has a list of prices for different products, and Kamal needs to find the maximum price of all products up to a given index.

        He has the list of prices in an array A of length N, and he needs to write a program that will return the maximum price occurring in the subarray from 0 to i for every index i. Kamal needs your help to implement this function.
     */
    public static int[] solve(int[] A) {
        int[] maxArr = new int[A.length];
        maxArr[0] = A[0];
        for(int i = 1; i < A.length; i++){
            if(A[i] > maxArr[i-1]){
                maxArr[i] = A[i];
            }else{
                maxArr[i] = maxArr[i-1];
            }
        }
        return maxArr;
    }
    public static void main(String[] args){
        int[] arr = {16, 8, 24, 9, 25, 17};
        int[] result = solve(arr);
        for(int i : result){
            System.out.print(i + " ");
        }
    }
    
}
