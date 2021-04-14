package leoli.leetcode.question105;

import leoli.leetcode.bean.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * 105. 从前序与中序遍历序列构造二叉树
 * 根据一棵树的前序遍历与中序遍历构造二叉树。
 *
 * 注意:
 * 你可以假设树中没有重复的元素。
 *
 * 例如，给出
 *
 * 前序遍历 preorder = [3,9,20,15,7]
 * 中序遍历 inorder = [9,3,15,20,7]
 * 返回如下的二叉树：
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 *
 * @See https://leetcode-cn.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
 *
 * @author leoli
 * @date 2021/4/13
 */
public class Solution {

    private Map<Integer, Integer> inMap = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        // 预加载inorder的索引 key:节点的值;value:该值在inorder中的索引
        for (int i = 0; i < inorder.length; i++) {
            inMap.put(inorder[i], i);
        }
        return traverse(preorder, inorder, 0, 0, inorder.length - 1);
    }

    private TreeNode traverse(int[] preorder, int[] inorder, int rootIdxPre, int leftStart, int rightEnd) {
        if (rightEnd < leftStart || leftStart < 0 || rightEnd < 0) return null;
        TreeNode node = new TreeNode(preorder[rootIdxPre]);
        int rootIdxIn = inMap.get(node.val);
        node.left = traverse(preorder, inorder, rootIdxPre + 1, leftStart, rootIdxIn - 1);
        // 如果左子树不为空，idx需要跳过左子树的长度
        int nextRootIdxPre = node.left == null ? rootIdxPre + 1 : rootIdxPre + rootIdxIn - leftStart + 1;
        node.right = traverse(preorder, inorder, nextRootIdxPre, rootIdxIn + 1, rightEnd);
        return node;
    }
}