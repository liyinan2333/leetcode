#include <iostream>
#include "math.h"
#include "../bean/Node.cpp"

/**
 * @author leoli
 * @date 2021/4/8
 */
class Solution {
private:
    int maxSum = INT32_MIN;
public:
    int maxPathSum(TreeNode *root) {
        traverse(root);
        return maxSum;
    }

    int traverse(TreeNode *node) {
        // 叶节点
        if (node == nullptr) {
            return 0;
        }
        // 求子节点的最大贡献值
        int maxLeft = fmax(traverse(node->left), 0);
        int maxRight = fmax(traverse(node->right), 0);

        // 更新答案
        maxSum = fmax(maxSum, node->val + maxLeft + maxRight);

        // 求本节点的最大贡献值
        return fmax(maxLeft, maxRight) + node->val;
    }
};