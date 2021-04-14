package leoli.leetcode.question0099;

import leoli.leetcode.bean.Tree;

public class App {

    public static void main(String[] args) {

        Tree tree = new Tree(new Integer[]{1, 3, null, null, 2});

        new Solution().recoverTree(tree.getRoot());

    }

}
