class Solution {
    public long maxProfit(int[] prices, int[] strategy, int k) {
        int n = prices.length;

        // Original profit
        long originalProfit = 0;
        for (int i = 0; i < n; i++) {
            originalProfit += (long) strategy[i] * prices[i];
        }

        // Arrays A and B
        long[] A = new long[n];
        long[] B = new long[n];
        for (int i = 0; i < n; i++) {
            A[i] = -(long) strategy[i] * prices[i];
            B[i] = (1L - strategy[i]) * prices[i];
        }

        // Prefix sums
        long[] PA = new long[n + 1];
        long[] PB = new long[n + 1];
        for (int i = 0; i < n; i++) {
            PA[i + 1] = PA[i] + A[i];
            PB[i + 1] = PB[i] + B[i];
        }

        // Find best delta
        long bestDelta = 0;
        int half = k / 2;
        for (int l = 0; l + k <= n; l++) {
            long delta = (PA[l + half] - PA[l]) + (PB[l + k] - PB[l + half]);
            bestDelta = Math.max(bestDelta, delta);
        }

        return originalProfit + bestDelta;
    }
}
