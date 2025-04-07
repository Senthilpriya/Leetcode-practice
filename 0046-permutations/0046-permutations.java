class Solution {
    public List<List<Integer>> permute(int[] nums) {
        ArrayList<List<Integer>> res=new ArrayList<>();
        per(nums,0,res);
        return res;
    }
    public void per(int[] nums,int st,ArrayList<List<Integer>> res){
        if(st==nums.length){
            List<Integer> pr=new ArrayList<>();
            for(int i:nums){
                pr.add(i);
            }
            res.add(pr);
            return;
        }
        for(int i=st;i<nums.length;i++){
            swap(nums,st,i);
            per(nums,st+1,res);
            swap(nums,st,i);
        }
    }
    public void swap(int []nums,int i,int j){
        int tem=nums[i];
        nums[i]=nums[j];
        nums[j]=tem;
        return;
    }
}