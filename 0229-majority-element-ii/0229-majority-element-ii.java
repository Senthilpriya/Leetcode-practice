class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Integer> arr=new ArrayList<>();
        for(Map.Entry<Integer,Integer> e: map.entrySet()){
            if(e.getValue()>nums.length/3){
                arr.add(e.getKey());
            }
        }
        return arr;
    }
}