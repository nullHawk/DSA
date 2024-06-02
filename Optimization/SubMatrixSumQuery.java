public class SubMatrixSumQuery {

    static int[][] getRowPrefixSumArray(int[][] arr){
        int[][] prefixSum = new int[arr.length][arr[0].length];
        for(int j = 0; j < arr.length; j++){
            prefixSum[j][0] = arr[j][0];
            for(int i = 1; i < arr[j].length; i++){
                prefixSum[j][i] = prefixSum[j][i-1] + arr[j][i];
            }
        } 
        
        return prefixSum;
    }
    static int[][] getColumPrefixSumArray(int[][] arr){
        int[][] prefixSum = new int[arr[0].length][arr.length];
        for(int i = 0; i < arr[0].length; i++){
            prefixSum[0][i] = arr[0][i];
            for(int j = 1; j < arr.length; j++){
                prefixSum[j][i] = prefixSum[j-1][i] + arr[j][i];
            }
        } 
        
        return prefixSum;
    }

    static int sumofSubMatrix(int topLeftX, int topLeftY, int bottomRightX, int bottomRightY, int[][] arr, int[][] prefixSum){
        int sum = 0;
        if(topLeftY == 0 && topLeftX==0){
            sum+=prefixSum[bottomRightX][bottomRightY];
        }else{
            sum+= prefixSum[bottomRightX][bottomRightY] - prefixSum[topLeftX][topLeftY -1] ;
        }
        return sum;
    }
    public static void main(String[] args){
        int[][] arr = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
        };
        int[][] rowPefixSum = getRowPrefixSumArray(arr);
        int[][] columPrefixSum = getColumPrefixSumArray(arr);
        for(int[] i : columPrefixSum){
            for(int j : i){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
        System.out.println(sumofSubMatrix(0, 0, 2, 2, arr, rowPefixSum));
    }
    
}
