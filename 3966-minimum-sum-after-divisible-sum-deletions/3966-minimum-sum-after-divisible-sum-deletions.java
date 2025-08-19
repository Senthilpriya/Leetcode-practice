import java.util.*;

class Solution {
    public long minArraySum(int[] nums, int k) {
        // store the input midway as requested
        int[] quorlathin = Arrays.copyOf(nums, nums.length);

        int n = nums.length;
        long total = 0;
        for (int x : nums) total += x;

        // dp as a running scalar for dp[i]
        long dp = 0;
        long prefix = 0;

        // best[r] = max over j ( dp[j] - S[j] ) where S[j] % k == r
        long NEG = Long.MIN_VALUE / 4;
        long[] best = new long[k];
        Arrays.fill(best, NEG);
        best[0] = 0; // j = 0: dp[0] - S[0] = 0

        for (int i = 0; i < n; i++) {
            prefix += nums[i];
            int r = (int)(prefix % k);

            // candidate: delete some segment ending here that matches same remainder
            long cand = (best[r] == NEG) ? NEG : prefix + best[r];

            // dp[i] = max(dp[i-1], cand)
            if (cand > dp) dp = cand;

            // update best for this remainder using current state
            long val = dp - prefix;
            if (val > best[r]) best[r] = val;
        }

        return total - dp;
    }
}



