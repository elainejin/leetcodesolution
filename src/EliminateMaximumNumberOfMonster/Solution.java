package EliminateMaximumNumberOfMonster;

import java.util.Arrays;

// 1921. Eliminate Maximum Number of Monsters
// Time complexity: O(n log n) Space complexity: O(n)
class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        for (int i = 0; i < dist.length; i++) {
            dist[i] = (int) Math.ceil(dist[i] / (double)speed[i]);
        }
        Arrays.sort(dist);
        int i = 1;
        for (; i < dist.length; i++) {
            if (dist[i] <= i) break;
        }
        return i;
    }
}
