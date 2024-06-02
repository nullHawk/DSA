package Backtracking;

import java.util.ArrayList;

public class Subsequence{
    void generate(ArrayList<Integer> cur, ArrayList<ArrayList<Integer>> ans, int index, int[] A){
        if(index == A.length){
            ans.add(new ArrayList<>(cur));
            return;
        }

        cur.add(A[index]);
        generate(cur, ans,index+1, A);
        cur.remove(cur.size()-1);
        generate(cur,ans,index+1,A);
    }
    public static void main(String[] args){
        Subsequence obj = new Subsequence();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> cur = new ArrayList<>();
        int[] A = {1,2,3};
        obj.generate(cur, ans, 0, A);
        for(ArrayList<Integer> l : ans){
            System.out.println(l);
        }
    }
}