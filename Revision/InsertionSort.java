class InsertionSort{

    static void sort(int[] arr){
        for(int i = 1 ; i < arr.length; i++){
            int key = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    public static void main(String[] args){
        int[] arr = {4,5,610,2,54,6,42,1,2,0};
        
        System.out.print("Array Before sorting : ");
        for(int i : arr){
            System.out.print(i +" ");
        }

        sort(arr);

        System.out.print("\nArray After sorting: ");
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}