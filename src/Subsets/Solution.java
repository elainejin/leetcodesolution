package Subsets;


import java.util.*;

/**
 * @Author Elaine Jin
 * @Date 2018-04-10
 * #78 Subsets
 */


public class Solution {

    private static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<Integer>());
        Arrays.sort(nums);
        for(int i : nums) {
            List<List<Integer>> tmp = new ArrayList<>();
            for(List<Integer> sub : res) {
                List<Integer> a = new ArrayList<>(sub);
                a.add(i);
                tmp.add(a);
            }
            res.addAll(tmp);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        for (List<Integer> set : subsets(nums)) {
            System.out.println(set.toString());
        }
    }
}
