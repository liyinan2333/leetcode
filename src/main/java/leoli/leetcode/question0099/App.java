package leoli.leetcode.question0099;

import leoli.leetcode.bean.Tree;

public class App {

    public static void main(String[] args) {

        Tree tree = new Tree(new Integer[]{3, 1, 4, null, null, 2});

        new Solution1().recoverTree(tree.getRoot());

        System.out.println();
    }

}
