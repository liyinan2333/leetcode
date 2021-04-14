package leoli.leetcode.question0099;

import leoli.leetcode.bean.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leoli
 * @date 2021/4/14
 */
public class Solution1 {

    TreeNode x = null;
    TreeNode y = null;

    public void recoverTree(TreeNode root) {
        List<TreeNode> list = new ArrayList();
        dfs(root, list);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).val < list.get(i - 1).val) {
                if (x == null) {
                    x = list.get(i - 1);
                }
                y = list.get(i);
            }
        }

        if (x != null && y != null) {
            int v = x.val;
            x.val = y.val;
            y.val = v;
        }

    }

    private void dfs(TreeNode node, List list) {
        if (node == null) {
            return;
        }
        dfs(node.left, list);
        list.add(node);
        dfs(node.right, list);
    }

}
