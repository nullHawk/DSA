public class coutnSetBits {
    static int countOfSetBits(int n){
        int count = 0;
        while (n>0){
            count+= n&1;
            n = n>>1;
        }
        return  count;
    }
    public static void main(String[] args){
        System.out.println(countOfSetBits(8));
    }
}
