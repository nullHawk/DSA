public class InsertionSort {
    //has advantage when stream of data is provided
    static void sort(int[] arr, int key, int j){
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = key;
    }

    public static void main(String[] args){
        int[] arr = {4,5,7,8,10,3};
        for(int i = 1; i < arr.length; i++){
            sort(arr, arr[i], i-1);
        }

        for(int i : arr){
            System.out.print(i +" ");
        }
        System.out.println();
    }
    
}
