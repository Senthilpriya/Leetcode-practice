class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> map=new LinkedHashMap<>();
        for(char c:s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        int index=-1;
        for(char c:map.keySet()){
            if(map.get(c)==1){
                index=s.indexOf(c);
                break;
            }
        }
        return index;
    }
}