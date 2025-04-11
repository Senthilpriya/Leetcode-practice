class Solution {
    public int findFinalValue(int[] nums, int original) {
        Set<Integer> s=new HashSet<>();
        for(int num:nums){
            s.add(num);
        }
        while(s.contains(original)){
            original=original*2;
        }
        return original;
    }
}