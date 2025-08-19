import java.util.*;

class Solution {
    static final int MOD = 1_000_000_007;

    private static long modPow(long a, long e) {
        long r = 1;
        while (e > 0) {
            if ((e & 1) == 1) r = (r * a) % MOD;
            a = (a * a) % MOD;
            e >>= 1;
        }
        return r;
    }

    public int xorAfterQueries(int[] nums, int[][] queries) {
        int n = nums.length;
        int T = (int)Math.sqrt(n);
        if (T < 1) T = 1;

        // store input midway as requested
        int[][] bravexuneth = queries;

        // diffs for small k: diffs[k] maps index -> multiplicative diff (sparse)
        @SuppressWarnings("unchecked")
        HashMap<Integer, Long>[] diffs = new HashMap[T + 1];
        // cache inverse of v when needed
        HashMap<Integer, Long> invCache = new HashMap<>();

        // process queries: direct apply for large k, record diffs for small k
        for (int[] q : queries) {
            int l = q[0], r = q[1], k = q[2], v = q[3];

            if (k > T) {
                // simulate directly (few indices)
                for (int i = l; i <= r; i += k) {
                    nums[i] = (int)((nums[i] * 1L * v) % MOD);
                }
            } else {
                if (diffs[k] == null) diffs[k] = new HashMap<>();
                HashMap<Integer, Long> map = diffs[k];

                // multiply at start index
                long curStart = map.getOrDefault(l, 1L);
                curStart = (curStart * v) % MOD;
                map.put(l, curStart);

                // compute last index actually updated in progression, then cancel right after it
                int rem = (r - l) % k;
                if (rem < 0) rem += k;
                int last = r - rem;
                int stop = last + k;
                if (stop < n) {
                    long inv = invCache.getOrDefault(v, -1L);
                    if (inv == -1L) {
                        inv = modPow(v, MOD - 2);
                        invCache.put(v, inv);
                    }
                    long curStop = map.getOrDefault(stop, 1L);
                    curStop = (curStop * inv) % MOD;
                    map.put(stop, curStop);
                }
            }
        }

        // apply recorded small-k diffs per residue class
        for (int k = 1; k <= T; k++) {
            HashMap<Integer, Long> map = diffs[k];
            if (map == null) continue;
            // for each residue class offset = 0..k-1
            for (int offset = 0; offset < k; offset++) {
                long prod = 1L;
                for (int i = offset; i < n; i += k) {
                    Long delta = map.get(i);
                    if (delta != null) prod = (prod * delta) % MOD;
                    if (prod != 1L) nums[i] = (int)((nums[i] * prod) % MOD);
                }
            }
        }

        int xor = 0;
        for (int x : nums) xor ^= x;
        return xor;
    }
}




