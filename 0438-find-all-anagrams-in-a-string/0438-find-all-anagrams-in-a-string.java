class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        Integer wstart = 0;
        List<Integer> res = new ArrayList();
        int matched = 0;
        HashMap<Character, Integer> pattern_map = new HashMap();
    
        for (char ch : p.toCharArray()) {
            pattern_map.put(ch, pattern_map.getOrDefault(ch, 0) + 1);
        }

        for (int wend = 0; wend < s.length(); wend++) {
            char ch = s.charAt(wend);
            if (pattern_map.containsKey(ch)) {
                int value = pattern_map.get(ch) - 1;
                pattern_map.put(ch, value);
                if (value == 0) {
                    matched += 1;
                }
            }
            if (wend >= p.length() - 1) {
                if (matched == pattern_map.size()) {
                    res.add(wstart);
                }
                char rch = s.charAt(wstart);
                wstart += 1;
                if (pattern_map.containsKey(rch)){
                    int value = pattern_map.get(rch);
                    if (value == 0) {
                        matched -= 1;
                    }
                    pattern_map.put(rch, value + 1);
                }
            }
        }
        return res;
    }
}