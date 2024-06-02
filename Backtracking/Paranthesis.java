package Backtracking;

import java.util.ArrayList;

public class Paranthesis {

    void generate(String cur, int open, int close, int N, ArrayList<String> ans){
        if(cur.length() == 2*N){
            ans.add(cur);
            return;
        }

        if(open < N){
            generate(cur+"(", open+1, close, N, ans);
        }
        if(close < open){
            generate(cur+")", open, close+1, N, ans);
        }
    }

    ArrayList<String> generateParanthesis(int N){
        ArrayList<String> ans = new ArrayList<>();
        generate("",0,0,N,ans);
        return ans;
    }

    public static void main(String[] args){
        Paranthesis obj = new Paranthesis();
        ArrayList<String> ans = obj.generateParanthesis(3);
        for(String s : ans){
            System.out.println(s);
        }
    }
    
}
