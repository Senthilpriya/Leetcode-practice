class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        String str="";
        int temp=99999999,index=0;
        for(int i=0;i<dictionary.size();i++){
            String word = dictionary.get(i);
            List<String>list = new ArrayList(Arrays.asList(s.split("")));
            List<String>list1 = new ArrayList(Arrays.asList(word.split("")));
            index=0;
            for(int j=0;j<list.size()&&index < list1.size();j++){
                if((list.get(j)).equals(list1.get(index)))
                        index++;
            }
            
            if (index == list1.size()) {
                if (word.length() > str.length() ||
                (word.length() == str.length() && word.compareTo(str) < 0)) {
                    str = word;
                    }
                }

        }
        return str;
    }
}