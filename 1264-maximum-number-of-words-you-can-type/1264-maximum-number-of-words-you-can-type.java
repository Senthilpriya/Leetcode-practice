class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int count=0;
        String s[]= text.trim().split(" ");
        for(int i=0;i<s.length;i++){
            String p=s[i];
            boolean valid=true;
            for(int j=0;j<brokenLetters.length();j++){
                char pr=brokenLetters.charAt(j);
                if(p.indexOf(pr)!=-1){
                    valid=false;
                    break;
                }
            }
            if(valid){
                count++;
            }
        }
        return count;
    }
}