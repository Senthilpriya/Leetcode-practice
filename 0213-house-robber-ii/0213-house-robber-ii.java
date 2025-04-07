class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1)
        return nums[0];

        int max1 = exclude(nums,0,n-2);
        int max2 = exclude(nums,1,n-1);

        return Math.max(max1,max2);
    }
    public int exclude(int[] nums,int start,int end) {
        int n = end - start + 1;

        if(n==0)
        return 0;

        if(n==1)
        return nums[start];

        int[] dp = new int[n];
        dp[0] = nums[start];
        dp[1] = Math.max(nums[start],nums[start+1]);

        for(int i=2;i<n;i++) {
            dp[i] = Math.max(dp[i-1],nums[start + i] + dp[i-2]);
        }

        return dp[n-1];
    }
}