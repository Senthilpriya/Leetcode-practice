class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> map1=new TreeMap<>();
        for(char c:s.toCharArray()){
            map1.put(c,map1.getOrDefault(c,0)+1);
        }
        Map<Character,Integer> map2=new TreeMap<>();
        for(char c:t.toCharArray()){
            map2.put(c,map2.getOrDefault(c,0)+1);
        }
        if(map1.equals(map2)){
            return true;
        }
        return false;
    }
}