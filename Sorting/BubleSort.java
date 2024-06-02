public class BubleSort {
    static void sort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length-1-i; j++){
                if(arr[j+1] < arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {3,4,6,80,1,-5,7};
        System.out.print("Before Sorting : ");
        for(int i : arr){
            System.out.print(i + ", ");
        }
        System.out.print("\nAfter Sorting : ");
        sort(arr);
        for(int i : arr){
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
