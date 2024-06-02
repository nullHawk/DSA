public class gimickMergesSort {
    //Given 2  sorted array A[N] B[M] merge them into sorted form

   
    static int[] twoArrSort(int[] A, int[] B){
        int[] arr = new int[A.length + B.length];
        int i = 0, j = 0, k = 0;

        while(i<A.length && j<B.length){
            if(A[i] <= B[j]){
                arr[k] = A[i];
                i++;
            }else{
                arr[k] = B[j];
                j++;
            }
            k++;

            if(i == A.length){
                while(j<B.length){
                    arr[k] = B[j];
                    j++;
                    k++;
                }
            }else if(j == B.length){
                while(i<A.length){
                    arr[k] = A[i];
                    i++;
                    k++;
                }
            }
        }
        return arr;
    }

    //l,m
    //n+1, r
    //l:2 m:4 r:7
    static int[] sort(int[] arr, int l, int m, int r){
        int[] a = new int[m-l+1]; 
        int[] b = new int[r-m];

        for(int i = l, j = 0; i<=m && j<a.length; i++,j++){
            a[j] = arr[i];
        }
        for(int i = m+1, j = 0; i<=r && j<b.length; i++,j++){
            b[j] = arr[i];
        }


        int[] sorted_arr = new int[a.length + b.length];

        sorted_arr = twoArrSort(a, b);
        for(int i = l, j = 0; i <=r; i++,j++){
            arr[i] = sorted_arr[j];
        }

        return arr;
    }

    //Try to solve this withour using extra array
    

    public static void main(String[] args){
        int[] a = {8,1,3,6,11,2,4,9,7,6};
        //int[] arr = sort(a, b);
        int[] arr = sort(a, 2, 4, 7);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }

}
