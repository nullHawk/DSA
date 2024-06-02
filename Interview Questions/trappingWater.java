public class trappingWater {
    //Given an array containing the hiegt of N  : find max amount of water getting accumulated b/w any two walls;
    public static int getWater(int[] a){
        int i = 0;
        int j = a.length-1;
        int ans = 0;
        while(i<j){
            int area = Math.min(a[i], a[j]) * (j-i);
            ans = Math.max(ans, area);
            if(a[i] < a[j]){
                i++;
            }else{
                j--;
            }
        }
        return 0;
    }
}
