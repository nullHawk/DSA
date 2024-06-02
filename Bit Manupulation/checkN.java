public class checkN {
    static boolean checkNth(int a, int n){
        int mask = 1<<(int)Math.pow(2,n);
        return ((a&mask) == 0) ? true : false;
    }
    public static void main(String[] args){
        int a = 45;
        int n = 5;
        System.out.println(checkNth(a, n));
    }
}
