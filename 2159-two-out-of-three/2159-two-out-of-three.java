class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        boolean num1[]=new boolean[101];
        boolean num2[]= new boolean[101];
        boolean num3[]=new boolean[101];
        int arr[]= new int[101];
        for(int num:nums1){
            if(!num1[num]){
                arr[num]++;
                num1[num]=true;
            }
        }
        for(int num:nums2){
            if(!num2[num]){
                arr[num]++;
                num2[num]=true;
            }
        }
        for(int num:nums3){
            if(!num3[num]){
                arr[num]++;
                num3[num]=true;
            }
        }
        List<Integer> count=new ArrayList<>();

        for(int i=0;i<101;i++){
            if(arr[i]>=2){
                count.add(i);
            }
        }
        return count;
    }
}