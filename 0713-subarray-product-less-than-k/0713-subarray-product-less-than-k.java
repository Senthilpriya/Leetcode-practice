class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        if(k <= 1 || n == 0) return 0;
        int result = 0;
        int product = 1;

        int i = 0;
        for(int j = 0; j < n; j++) {
            product *= nums[j];

            while(product >= k && i <= j) {
                product /= nums[i];
                i += 1;
            }
            result += j - i + 1;
        }

        return result;
    }
}