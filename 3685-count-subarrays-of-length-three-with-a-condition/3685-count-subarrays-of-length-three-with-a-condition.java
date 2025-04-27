class Solution {
    public int countSubarrays(int[] nums)
 {
        int count = 0;
        for (int i = 2; i < nums.length; i++) {
            int a=nums[i-2];
            int b=nums[i-1];
            int c=nums[i];
            int d=a+c;
            if(2*d==b){
                count++;
            }
           
        }
        return count;
    }
}




