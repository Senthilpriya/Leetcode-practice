class Solution {
    public int countHillValley(int[] nums) {
        int c=0;
        int n=nums.length;
        List<Integer> arr= new ArrayList<>();
        arr.add(nums[0]);
        for(int i=1;i<n;i++){
            if
            (nums[i]!=nums[i-1]){
                arr.add(nums[i]);
            }

        }
        for(int i=1;i<arr.size()-1;i++){
            int left=arr.get(i-1);
            int right=arr.get(i+1);
            int cur=arr.get(i);
            if((cur<right && cur<left)|| (cur>right && cur>left)){
                c++;
            }

        }
        return c;
    }
}