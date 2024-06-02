import java.util.Stack;

public class q1 {
    //Nearest smallest element: Given an array of +ve number , for every index i find the nearest smallest element of the left side of i else return -1
    static int[] getNearestSmallest(int[] arr){
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            while(!stack.isEmpty() && stack.peek()>=arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                result[i] = -1;
            }else{
                result[i] = stack.peek();
            }
            stack.push(arr[i]);
        }

        return result;
    }

    public static void main(String[] args){
        int[] arr = {4,2,5,10,8,2};
        int[] result = getNearestSmallest(arr);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
    
}
