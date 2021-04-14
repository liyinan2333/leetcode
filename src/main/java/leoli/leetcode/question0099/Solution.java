package leoli.leetcode.question0099;

import leoli.leetcode.bean.TreeNode;

/**
 * @author leoli
 * @date 2021/4/14
 */
public class Solution {

    public void recoverTree(TreeNode root) {

        traverse(root);

    }

    private void traverse(TreeNode node) {
        //　拿到左子树和右字树的根节点的值
        if(node.left != null) {
            traverse(node.left);
            if (node.left.val > node.val) {
                int v = node.left.val;
                node.left.val = node.val;
                node.val = v;
            }
        }
        if(node.right != null) {
            traverse(node.right);
            if (node.right.val < node.val) {
                int v = node.right.val;
                node.right.val = node.val;
                node.val = v;
            }
        }

    }

}
