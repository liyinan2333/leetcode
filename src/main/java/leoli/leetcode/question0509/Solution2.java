package leoli.leetcode.question0509;

/**
 * 方案2：自底向上+内存优化
 *
 * @author leoli
 * @date 2021/4/16
 */
class Solution2 {

    int fib(int n) {
        if (n == 0 || n == 1) return n;
        int n_2 = 0, n_1 = 1, valueN = -1;
        for (int i = 2; i <= n; i++) {
            valueN = n_1 + n_2;
            n_2 = n_1;
            n_1 = valueN;
        }
        return n_1;
    }

}
