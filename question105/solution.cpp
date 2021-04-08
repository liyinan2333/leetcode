#include <iostream>
#include "math.h"
#include "../bean/Node.cpp"

/**
 * @author leoli
 * @date 2021/4/8
 */
class Solution {

    //前序遍历 preorder = [3,9,20,15,7]
    //中序遍历 inorder  = [9,3,15,20,7]

public:
    TreeNode *buildTree(vector<int> &preorder, vector<int> &inorder) {
        // 递归找root
        traverse(&preorder, &inorder, preorder[0], 0, inorder.length-1);

    }

    int traverse(vector<int> &preorder, vector<int> &inorder, int rootVal, int leftStart, int rightEnd) {
        int rootIdx = nullptr;
        for (int i = 0; i < inorder.length; i++) {
            if(inorder[i] == rootVal) {
                rootIdx = i;
            }
        }
        // leftEnd = rootIdx - 1
        // rightStart = rootIdx
    }
};