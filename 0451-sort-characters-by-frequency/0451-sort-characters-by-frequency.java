class Solution {
    public String frequencySort(String s) {
        char c[]=s.toCharArray();
        Map<Character,Integer> map=new HashMap<>();
        for(char i:c){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Character> arr=new ArrayList<>(map.keySet());
        arr.sort((a,b) -> map.get(b)-map.get(a));
        StringBuilder str=new StringBuilder();
        for(int i=0;i<arr.size();i++){
            char ch=arr.get(i);
            int freq=map.get(ch);
            for(int j=0;j<freq;j++){

            
            str.append(ch);
            }
        }
return str.toString();
    }
}