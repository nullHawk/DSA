package Backtracking;
import java.util.*;
public class Nnum{
    //generates number with n digits using 1 & 2
    void generate(ArrayList<ArrayList<Integer>> ans, int n, ArrayList<Integer> list){
        if(list.size() == n){
            ans.add(new ArrayList<>(list));
            return;
        }
        list.add(1);
        generate(ans, n, list);
        list.remove(list.size()-1);
        list.add(2);
        generate(ans, n, list);
        list.remove(list.size()-1);
    }
    public static void main(String[] args){
        Nnum obj = new Nnum();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        obj.generate(ans, 3, list);
        for(ArrayList<Integer> l : ans){
            System.out.println(l);
        }
    }
}