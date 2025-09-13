class Solution {
    public int maxFreqSum(String s) {
        String vowel="aeiou";
        String consonant="b";
        char arr[]=s.toCharArray();
        Map<Character,Integer> map= new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int maxc=0,maxv=0;
       for(char cr: map.keySet() ){
        if(vowel.indexOf(cr)!=-1){
           maxv=Math.max(maxv,map.get(cr));
        }
        else{
            maxc=Math.max(maxc,map.get(cr));
        }

       }
       return maxc+maxv;
    }
}