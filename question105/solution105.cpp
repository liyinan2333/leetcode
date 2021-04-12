#include <iostream>
#include "math.h"
#include "../bean/Node.cpp"
#include <vector>

using namespace std;

/**
 * @author leoli
 * @date 2021/4/8
 */

int main() {
    vector preorder{3, 9, 20, 15, 7};
    vector inorder{9, 3, 15, 20, 7};
    new Solution().buildTree(preorder, inorder);
    return 0;
}

class Solution {

    //前序遍历 preorder = [3,9,20,15,7]
    //中序遍历 inorder  = [9,3,15,20,7]

public:
    TreeNode *buildTree(vector<int> &preorder, vector<int> &inorder) {
        // 递归找root
        return traverse(preorder, inorder, 0, inorder.size() - 1);
    }

    TreeNode *traverse(vector<int> &preorder, vector<int> &inorder, int leftStart, int rightEnd) {
        TreeNode *node = new TreeNode();
        node->val = preorder[0];
        int rootIdx = -1;
        for (int i = 0; i < inorder.size(); i++) {
            if (inorder[i] == node->val) {
                rootIdx = i;
            }
        }
        // leftEnd = rootIdx - 1
        // rightStart = rootIdx
        if (rootIdx - 1 == leftStart) {
            node->left = new TreeNode();
        } else {
            node->left = traverse(preorder, inorder, leftStart, rootIdx - 1);
        }
        if (rootIdx == rightEnd) {
            node->right = new TreeNode();
        } else {
            node->right = traverse(preorder, inorder, rootIdx, rightEnd);
        }
        return node;
    }
};