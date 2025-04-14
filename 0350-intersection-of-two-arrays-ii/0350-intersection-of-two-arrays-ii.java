class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int arr1[]=new int[1001];
        int arr2[]=new int[1001];
        List<Integer> arrr=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            arr1[nums1[i]]++;
        }
        for(int i=0;i<nums2.length;i++){
            arr2[nums2[i]]++;
        }
        for(int i=0;i<1001;i++){
            if(arr1[i]>0 && arr2[i]>0){
           
                int min=Math.min(arr1[i],arr2[i]);
                for(int j=0;j<min;j++){
                arrr.add(i);
                }
                
                  }
                  
            
        }
        
        int neww[]=new int[arrr.size()];
        for(int i=0;i<arrr.size();i++){
            neww[i]=arrr.get(i);
        }
        return neww;
    }
}