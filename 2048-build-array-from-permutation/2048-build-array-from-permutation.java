class Solution {
    public int[] buildArray(int[] nums) {
        int arr[]=new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[nums[j++]];

        }
        return arr;
    }
}