class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long c=0,st=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                st++;
            }
            else{
                st=0;
            }
            c+=st;
        }
        return c;
    }
}