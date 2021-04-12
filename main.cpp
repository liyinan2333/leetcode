#include <iostream>
#include "bean/Node.cpp"
#include <vector>

int main() {
    std::cout << "Hello, World!" << std::endl;
    TreeNode root = *new TreeNode(2);
    root.left = new TreeNode(10);
    std::cout << root.val << std::endl;
    std::cout << root.left->val << std::endl;

    vector preorder = new vector(3,9,20,15,7);
    vector inorder = new vector(9.3.15.20.7);
    buildTree(preorder, inorder);
    return 0;
}
