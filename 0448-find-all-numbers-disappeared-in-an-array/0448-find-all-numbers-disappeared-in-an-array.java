class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        List<Integer> arr=new ArrayList<>();
        boolean present[]=new boolean[nums.length+1];
        int max=0;
        for(int num:nums){
            present[num]=true;
            max=Math.max(num,max);
        }
        for(int i=1;i<=nums.length;i++){
            if(!present[i]){
                arr.add(i);
            }
        }
        return arr;
    }
}