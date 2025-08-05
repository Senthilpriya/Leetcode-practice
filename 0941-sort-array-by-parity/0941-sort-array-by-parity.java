class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int k = nums.length;
        int j = 0;
        int [] arr = new int [k];
        for(int i = 0 ; i<nums.length; i++){
            if((nums[i] % 2) == 0){
                arr[j] = nums[i];
                j++;
            }else{
                arr[k-1] = nums[i];
                k--;
            }
        }
        return arr;
    }
}