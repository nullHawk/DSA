import java.util.Arrays;

public class KMin {
    static int getKMinElem(int[] arr, int k ){
        Arrays.sort(arr);
        return arr[k-1];
    }
}
