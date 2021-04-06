#include <iostream>
#include "bean/Node.cpp"

int main() {
    std::cout << "Hello, World!" << std::endl;
    TreeNode root = *new TreeNode(2);
    root.left = new TreeNode(10);
    std::cout << root.val << std::endl;
    std::cout << root.left->val << std::endl;
    return 0;
}
