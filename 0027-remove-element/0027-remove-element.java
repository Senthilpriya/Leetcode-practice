class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0;
       

       int left=0,right=nums.length-1;
       while(left<=right ){
        if(nums[left]==val ){
            nums[left]=nums[right];
            right--;
        }
        else{
            left++;
        }
        
        
       }
       return right+1;
    }
}