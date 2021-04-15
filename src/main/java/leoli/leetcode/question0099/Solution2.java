package leoli.leetcode.question0099;

import leoli.leetcode.bean.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 方式2：中序遍历时记录pre指针，比较pre和current，记录异常节点并互换
 *
 * @author leoli
 * @date 2021/4/14
 */
public class Solution2 {

    TreeNode x = null;
    TreeNode y = null;
    TreeNode pre = null;

    public void recoverTree(TreeNode root) {
        dfs(root);
        if (x != null && y != null) {
            int v = x.val;
            x.val = y.val;
            y.val = v;
        }

    }

    private void dfs(TreeNode node) {
        if (node == null) {
            return;
        }
        dfs(node.left);
        if (pre == null) {
            pre = node;
        } else {
            if (pre.val > node.val) {
                y = node;
                if (x == null) {
                    x = pre;
                }
            }
            pre = node;
        }
        dfs(node.right);
    }

}
