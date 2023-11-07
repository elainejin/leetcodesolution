package EqualRowAndColumnPairs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// 2352. Equal Row and Column Pairs
// Time complexity: O(n^2) Space complexity: O(n)
class Solution {
    public int equalPairs(int[][] grid) {
        int res = 0, n = grid.length;
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String row = Arrays.toString(grid[i]);
            map.put(row, map.getOrDefault(row, 0) + 1);
        }
        for (int j = 0; j < n; j++) {
            int[] col = new int[n];
            for (int i = 0; i < n; i++) {
                col[i] = grid[i][j];
            }
            res += map.getOrDefault(Arrays.toString(col), 0);
        }
        return res;
    }
}
