package leoli.leetcode.question0509;

import java.util.HashMap;
import java.util.Map;

/**
 * 斐波那契数，通常用F(n) 表示，形成的序列称为 斐波那契数列 。该数列由0 和 1 开始，后面的每一项数字都是前面两项数字的和。也就是：
 * <p>
 * F(0) = 0，F(1)= 1
 * F(n) = F(n - 1) + F(n - 2)，其中 n > 1
 * 给你 n ，请计算 F(n) 。
 * <p>
 * 示例 1：
 * 输入：2
 * 输出：1
 * 解释：F(2) = F(1) + F(0) = 1 + 0 = 1
 * 示例 2：
 * 输入：3
 * 输出：2
 * 解释：F(3) = F(2) + F(1) = 1 + 1 = 2
 * 示例 3：
 * 输入：4
 * 输出：3
 * 解释：F(4) = F(3) + F(2) = 2 + 1 = 3
 * <p>
 * 提示：
 * 0 <= n <= 30
 *
 * @author leoli
 * @date 2021/4/15
 * @See https://leetcode-cn.com/problems/fibonacci-number
 */
public class Solution {

    private Map<Integer, Integer> values = new HashMap<>();

    public int fib(int n) {
        if (n == 0 || n == 1) return n;
        Integer valueN = values.get(n);
        if (valueN == null) {
            valueN = fib(n - 1) + fib(n - 2);
            values.put(n, valueN);
            return valueN;
        }
        return valueN;
    }

}
