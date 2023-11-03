package BuildAnArrayWithStackOperations;

import java.util.ArrayList;
import java.util.List;

//1441. Build an Array With Stack Operations
class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> res = new ArrayList<>();
        int currIdx = 0, currNo = 1;
        while (currIdx < target.length) {
            if (target[currIdx] == currNo) {
                res.add("Push");
                currIdx++;
            } else {
                res.add("Push");
                res.add("Pop");
            }
            currNo++;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] target = {1, 3};
        int n = 3;
        List<String> res = new Solution().buildArray(target, n);
        // Expected ["Push","Push","Pop","Push"]
        System.out.println(res.toString());

        target = new int[]{1, 2, 3};
        res = new Solution().buildArray(target, n);
        // Expected ["Push","Push","Push"]
        System.out.println(res.toString());

        target = new int[]{1, 2};
        n = 4;
        res = new Solution().buildArray(target, n);
        // Expected ["Push","Push"]
        System.out.println(res.toString());
    }
}
