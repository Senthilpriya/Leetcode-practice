class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> ori= new HashSet<>();
        for(int i=0;i<sentence.length();i++){
            char c=sentence.charAt(i);
            ori.add(c);
        }
        if(ori.size()==26){
            return true;
        }
        return false;
    }
}