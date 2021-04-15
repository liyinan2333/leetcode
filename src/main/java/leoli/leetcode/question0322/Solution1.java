
package leoli.leetcode.question0322;

import java.util.HashMap;
import java.util.Map;

/**
 * @author leoli
 * @date 2021/4/15
 */
class Solution1 {

    Map<Integer, Integer> cache = new HashMap<>();

    int coinChange(int[] coins, int amount) {
        // base case
        if (amount == 0) return 0;
        if (amount < 0) return -1;
        // 去重
        if (cache.containsKey(amount)) return cache.get(amount);

        // sub question
        int result = Integer.MAX_VALUE;
        for (int coin : coins) {
            int subQuestion = coinChange(coins, amount - coin);
            if (subQuestion == -1) continue;
            result = Math.min(result, 1 + subQuestion);
        }
        result = result == Integer.MAX_VALUE ? -1 : result;
        // 缓存去重
        cache.put(amount, result);
        return result;
    }

}
