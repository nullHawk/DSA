public class bitwiseDivide {
    static int getQuotient(int dividend, int divisor){
        int quotient = 0;
        while(dividend >= divisor){
            int temp = divisor;
            int multiple = 1;
            while (dividend>= (temp<<1)){
                temp <<= 1;
                multiple <<=1;
            }
            dividend -= temp;
            quotient += multiple;
        }
        return quotient;
    }

    public static void main(String[] args){
        System.out.println(getQuotient(16, 3));

    }
}
