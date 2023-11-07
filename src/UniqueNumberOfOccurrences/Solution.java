package UniqueNumberOfOccurrences;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// 1207. Unique Number of Occurrences
// Time complexity: O(n) Space complexity: O(n)
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : arr) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        Set<Integer> set = new HashSet<>();
        for (Integer value : map.values()) {
            if (!set.add(value)) return false;
        }
        return true;
    }
}
