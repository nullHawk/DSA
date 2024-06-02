public class Power {

    static long power(int a,int n){
        if(n==0 || a==1) return 1;
        if(n%2 == 0){
            return power(a, n/2) * power(a, n/2);
        }else{
            return a * power(a, n/2) * power(a, n/2);
        }
    }

    public static void main(String[] args){
        System.out.println(power(5, 512));
    }
    
}
