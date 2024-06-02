package DynamicProgramming;

public class NStep {

    //Given N stairs, from ith stair you can either go to (i + 1) step or i + 2 step. Count the number of ways reaching the Nth step from 0th step.
    static int totalWays(int n, int[] steps){
        if(n == 0){
            return 1;
        }
        if(n < 0){
            return 0;
        }
        if(steps[n] != -1){
            return steps[n];
        }
        steps[n] = totalWays(n-1, steps) + totalWays(n-2, steps);
        return steps[n];
    }
    
    public static void main(String[] args) {
        int n = 6;
        int[] steps = new int[n];
        for(int i = 0; i < n; i++){
            steps[i] = -1;
        }
        System.out.println(totalWays(5,steps));
    }
    
}
