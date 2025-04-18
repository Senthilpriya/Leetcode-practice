class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int clonee[]=arr.clone();
            Arrays.sort(clonee);
        int count=1;
       
        Map<Integer,Integer> s=new HashMap<>();
    for(int num:clonee){
        if(!s.containsKey(num)){
            s.put(num,count++);
        }
    }
    
        int arrr[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            arrr[i]=s.get(arr[i]);
        }
return arrr;
    }
    }