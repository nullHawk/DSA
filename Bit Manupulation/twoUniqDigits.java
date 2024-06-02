public class twoUniqDigits {
    //Given an array of +ve no. Every elemnt appears two times expet two element which appears exactly one time.

    static void printTwoUniq(int[] arr){
        int xorOfDig = arr[0];
        for(int i = 1; i < arr.length; i++){
            xorOfDig ^= arr[i];
        }

        //Get set bit
        int bitPosition = 0;
        while ((xorOfDig & (1 << bitPosition)) == 0){
            bitPosition += 1;
        }

        int group1 = 0;
        int group2 = 0;
        int mask = 1<<bitPosition;
        for(int i = 0; i < arr.length; i++){
            if((arr[i]&mask) == 0 ){
                group1^=arr[i];
            }else{
                group2^=arr[i];
            }
        }
        System.out.println("The two numbers are :\n"+group1);
        System.out.println(group2);
    }

    public static void main(String[] args){
        int[] arr = {3,6,4,4,6,8};
        printTwoUniq(arr);
    }
    
}
