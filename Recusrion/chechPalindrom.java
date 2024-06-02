public class chechPalindrom {
    static boolean isPalindrom(String s, int i){
        if(i==s.length()){
            return true;
        }
        if(s.charAt(i) != s.charAt(s.length() - 1 - i)){
            return false;
        }
        return isPalindrom(s,i +1);
    }
    public static void main(String[] args){
        System.out.println(isPalindrom("mom", 0));
    }
    
}
