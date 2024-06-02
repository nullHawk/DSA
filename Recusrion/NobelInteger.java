import java.util.Arrays;

public class NobelInteger {
    static int getCountOfNI(int[] arr){
        int countOfNI = 0;
        for(int i = 0; i < arr.length; i++){
            if (arr[i] == i){
                countOfNI++;
            }
        }
        return countOfNI;
    }
    public static void main(String[] args){
        int[] arr = {-1, -5, 3, 5, -10, 4};
        Arrays.sort(arr);
        System.out.println(getCountOfNI(arr));
    }
    
}
