class Solution {
    public int countWords(String[] words1, String[] words2) {
        int count=0;
        List<String> str1=Arrays.asList(words1);
        List<String> str2=Arrays.asList(words2);
        Set<String> unique=new HashSet<>();
        Set<String> dup=new HashSet<>();
        for( String num:words1){
            if(!unique.add(num)) dup.add(num);

        }
        unique.removeAll(dup);
        Set<String> unique1=new HashSet<>();
        Set<String> dup1=new HashSet<>();
        for( String num:words2){
            if(!unique1.add(num)) dup1.add(num);

        }
        unique1.removeAll(dup1);
        for(String num:unique){
            if(unique1.contains(num)){
                count++;
            }
        }
return count;
    }
}