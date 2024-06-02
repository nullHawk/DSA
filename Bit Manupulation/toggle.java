public class toggle {
    static boolean getIth(int a, int n){
        int mask = 1<<n;
        if((a&mask) != 1){
            return true;
        }else{
            return false;
        }
    }
    static int toggleIth(int a, int n){
        int mask = 1<<n;
        boolean digit = getIth(a, n);
        if(digit){
            return a - mask;
        }else{
            return a + mask;
        }
    }
    public static void main(String[] args){
        System.out.println(toggleIth(10, 1));
    }
    
}
