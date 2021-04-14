package leoli.leetcode.bean;

public class Tree {

    private Integer[] arr;

    public Tree(Integer arr[]) {
        this.arr = arr;
    }

    public TreeNode getRoot() {
        return new TreeNode(arr[0], this.getLeft(0), this.getRight(0));
    }

    private TreeNode getLeft(int rootIndex) {
        int ind = 0;
        if ((ind = 2 * rootIndex + 1) >= arr.length || arr[ind] == null) {
            return null;
        } else {
            return new TreeNode(arr[ind], this.getLeft(ind), this.getRight(ind));
        }
    }

    private TreeNode getRight(int rootIndex) {
        int ind = 0;
        if ((ind = 2 * rootIndex + 2) >= arr.length || arr[ind] == null) {
            return null;
        } else {
            return new TreeNode(arr[ind], this.getLeft(ind), this.getRight(ind));
        }
    }

}
