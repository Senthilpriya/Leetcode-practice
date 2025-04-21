class Solution {
    public int minSteps(String s, String t) {
        char s1[]=s.toCharArray();
        char s2[]=t.toCharArray();
        Map<Character,Integer> map1=new HashMap<>();
        Map<Character,Integer> map2=new HashMap<>();
        for(char c:s1){
            map1.put(c,map1.getOrDefault(c,0)+1);

        }
        for(char c:s2){
            map2.put(c,map2.getOrDefault(c,0)+1);

        }
        int step=0;
        for(char c='a';c<='z';c++){
            int count1=map1.getOrDefault(c,0);
            int count2=map2.getOrDefault(c,0);
            step+=Math.abs(count1-count2);
        }
        return step/2;
    }
}