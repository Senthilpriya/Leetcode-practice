class Solution {
    public int findNumbers(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            int p=nums[i];
            int count=0;
            while(p>0){
                int rem=p%10;
                count++;
                p=p/10;
            }
            if(count%2==0){
c++;
            }
        }
        return c;
    }
}