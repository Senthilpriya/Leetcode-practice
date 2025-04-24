class Solution {
    public int countCompleteSubarrays(int[] nums) {
         boolean seen[]=new boolean[2001];
         int total=0;
         for(int num:nums){
            if(!seen[num]){
                seen[num]=true;
                total++;
            }
         }
         int count=0;
         for(int i=0;i<nums.length;i++){
            boolean arr[]=new boolean[2001];
            int unique=0;
            for(int j=i;j<nums.length;j++){
                if(!arr[nums[j]]){
                    arr[nums[j]]=true;
                    unique++;
                }
                if(total==unique) count++;
            }

         }
         return count;
    }
}