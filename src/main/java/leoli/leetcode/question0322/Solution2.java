package leoli.leetcode.question0322;

/**
 * @author leoli
 * @date 2021/4/15
 */
public class Solution2 {

    int coinChange(int[] coins, int amount) {
        int[] caches = new int[amount + 1];
        caches[0] = 0;
        for (int i = 1; i <= amount; i++) {
            caches[i] = amount + 1;
            for (int coin : coins) {
                // sub question has no answer
                if (i < coin) continue;
                caches[i] = Math.min(caches[i], 1 + caches[i - coin]);
            }
        }
        return caches[amount] == amount + 1 ? -1 : caches[amount];
    }
}
