package CountNodesEqualToAverageOfSubtree;
import java.util.AbstractMap;
import java.util.Map.Entry;

/**
 * Definition for a binary tree node.
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

//2265. Count Nodes Equal to Average of Subtree
class Solution {
    int res;

    public int averageOfSubtree(TreeNode root) {
        postOrder(root);
        return res;
    }

    /**
     * Performs a post-order traversal of the binary tree rooted at the specified node.
     * Calculates the sum of values in the subtree and the total count of sub-nodes.
     *
     * @param root The root node of the binary tree to start the traversal.
     * @return An Entry containing two integers:
     *  - The first integer is the sum of values in the subtree rooted at the specified node.
     *  - The second integer is the total count of sub-nodes in the subtree.
     */
    public Entry<Integer, Integer> postOrder(TreeNode root) {
        if (root == null) {
            return new AbstractMap.SimpleEntry<>(0, 0);
        }
        Entry<Integer, Integer> left = postOrder(root.left);
        Entry<Integer, Integer> right = postOrder(root.right);
        int sum = left.getKey() + right.getKey() + root.val;
        int count = left.getValue() + right.getValue() + 1;

        // Java integer division truncates decimal part already
        // as this question requested to round down when calculating the average
        if (root.val == sum / count) {
            res++;
        }
        return new AbstractMap.SimpleEntry<>(sum, count);
    }
}

