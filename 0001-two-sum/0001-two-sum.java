class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map= new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     map.put(nums[i],i);
        // }

        for(int i=0;i<nums.length;i++){
            int p=target-nums[i];
            if(map.containsKey(p)){
                return new int[]{i,map.get(p)};
            }
            map.put(nums[i],i);

        }
        return new int[]{};
    }
}