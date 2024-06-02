package Backtracking;

import java.util.ArrayList;

public class Permutation {
    //Given an array generate all permuation using backtracking
    private ArrayList<Integer> gen(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        backtrack(nums, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] nums, ArrayList<Integer> temp, ArrayList<Integer> result) {
        if (temp.size() == nums.length) {
            result.addAll(temp);
            result.add(-1); 
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (temp.contains(nums[i])) {
                continue;
            }
            temp.add(nums[i]);
            backtrack(nums, temp, result);
            temp.remove(temp.size() - 1);
        }
    }
    public static void main(String[] args) {
        Permutation obj = new Permutation();
        int[] nums = {1, 2, 3};
        ArrayList<Integer> result = obj.gen(nums);
        for (int i : result) {
            if (i == -1) {
                System.out.println(); // Print a line break
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
