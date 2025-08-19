class Solution {
    private static final long MOD = 1000000007L;
    
    public int xorAfterQueries(int[] nums, int[][] queries) {
        for (int[] q : queries) {
            int l = q[0], r = q[1], k = q[2], v = q[3];
            for (int idx = l; idx <= r; idx += k) {
                nums[idx] = (int) ((nums[idx] * 1L * v) % MOD);
            }
        }
        
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }
        return xor;
    }
}
