public class digitSum {
    static int digSum(int num){
        if(num==0){
            return 0 ;
        }
        return num%10 + digSum(num/10);
    }
    public static void main(String[] args){
        int num = 45;
        System.out.println(digSum(num));
    }
    
}
