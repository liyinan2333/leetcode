package leoli.leetcode.question0099;

import leoli.leetcode.bean.TreeNode;

/**
 * 方式3：没搞懂...
 * O(1) 的空间复杂度 莫里斯遍历
 */
public class Solution3 {
    public void recoverTree(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode x = null;
        TreeNode y = null;
        TreeNode pre = null;
        TreeNode tmp = null;
        while (root != null) {
            if (root.left != null) {
                tmp = root.left;
                while (tmp.right != null && tmp.right != root) {
                    tmp = tmp.right;
                }
                if (tmp.right == null) {
                    tmp.right = root;
                    root = root.left;
                } else {
                    if (pre != null && pre.val > root.val) {
                        y = root;
                        if (x == null) {
                            x = pre;
                        }
                    }
                    pre = root;
                    tmp.right = null;
                    root = root.right;
                }
            } else {
                if (pre != null && pre.val > root.val) {
                    y = root;
                    if (x == null) {
                        x = pre;
                    }
                }
                pre = root;
                root = root.right;
            }
        }
        if (x != null && y != null) {
            int t = x.val;
            x.val = y.val;
            y.val = t;
        }
    }
}