public class printELement {
    static void printElem(int[] arr, int i){
        if(i == arr.length){
            return;
        }
        printElem(arr, i + 1);
        System.out.print(arr[i] + " ");
        
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        printElem(arr, 0);
        System.out.println();
    }
    
}
