class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Integer> arr=new ArrayList<>(map.keySet());
    //    for(Map.Entry<Integer,Integer> entry:map.entrySet()){
    //     if(entry.getValue()>=k){
    //         arr.add(entry.getKey());
    //     }
    //    }  
    
    // int ind=0;
    // while(k!=0){
    //     int max=0;
    //     int val=0;
    //     for(int i:map.keySet()){
    //         if(map.get(i)>max){
    //             max=map.get(i);
    //             val=i;
    //         }
    //     }
    //     arr
    // }
     Collections.sort(arr, (a, b) -> map.get(b) - map.get(a));     
       int arr1[]=new int[k];
       for(int i=0;i<k;i++){
        arr1[i]=arr.get(i);
       }
        return arr1;    
    }
}