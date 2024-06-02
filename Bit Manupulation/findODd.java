
public class findODd {
    public static void main(String[] args){
        int[] arr = {2,7,3,6,2,2,3,2,7,6,6,7,7,1,1};
        int oddNumber = arr[0];
        for(int i = 1; i < arr.length; i++){
            oddNumber ^= arr[i];
        }
        System.out.println(oddNumber);
    }
}
