public class fibonacci {
    static int getAthElem(int num1, int num2, int A, int i){
        if(i == A-1){
            return num2;
        }
        return getAthElem(num2,num1+num2, A, ++i);
    }
    static int findAthFibonacci(int A) {
        if (A == 0){
            return 0;
        }else if(A == 1){
            return 1;
        }
        return getAthElem(1, 2, A, 2);
    }

    public static void main(String[] args){
        System.out.println(findAthFibonacci(5));
    }
    
}
