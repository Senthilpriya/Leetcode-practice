class Solution {
    public long maximumSumOfHeights(int[] nums) {
        int n=nums.length;
        if(nums.length==1){
            return nums[0];
        }
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i>0 && i<n-1 && nums[i]>=nums[i-1]){
                if(i+1<n && nums[i]>=nums[i+1]){
                    list.add(i);
                }
            }
            else if(i==0){
                if(i+1<n && nums[i]>=nums[i+1]){
                    list.add(i);
                }
            }
            else if(i==n-1){
                if(i-1>=0 && nums[i]>=nums[i-1]){
                    list.add(i);
                }
            }
        }
        long maxsum=0;
        for(int i=0;i<list.size();i++){
            int val=nums[list.get(i)];
            long sum=getArray(nums,val,list.get(i));
            maxsum=Math.max(sum,maxsum);            
        }
        return maxsum;
    }
    public static long getArray(int [] nums,int val,int idx){
        int [] arr=new int[nums.length];
        arr[idx]=val;
        long sum=val;
        for(int i=idx-1;i>=0;i--){
            if(nums[i]<=arr[i+1]){
                arr[i]=nums[i];
                sum+=arr[i];
            }
            else{
                arr[i]=arr[i+1];
                sum+=arr[i];
            }
        }
        for(int i=idx+1;i<nums.length;i++){
            if(nums[i]<=arr[i-1]){
                arr[i]=nums[i];
                sum+=arr[i];
            }
            else{
                arr[i]=arr[i-1];
                sum+=arr[i];
            }
        }
        return sum;
    }
}