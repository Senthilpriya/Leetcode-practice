class Solution {
    int MOD = 1_000_000_007;

    public int maxSumMinProduct(int[] nums) {
        int n = nums.length;
        long[] prefixSum = new long[n];

        prefixSum[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }

        int[] NSE = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums[i] < nums[stack.peek()]) {
                stack.pop();
            }
            NSE[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        stack.clear();

        int[] PSE = new int[n];
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] >= nums[i]) {
                stack.pop();
            }
            PSE[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }

        long res = 0;
        for (int i = 0; i < n; i++) {
            int nseIdx = (NSE[i] == -1) ? n : NSE[i];
            int pseIdx = PSE[i];

            long sum = prefixSum[nseIdx - 1] - (pseIdx == -1 ? 0 : prefixSum[pseIdx]);
            long product = sum * nums[i];

            res = Math.max(res, product);
        }

        return (int) (res % MOD);
    }
}