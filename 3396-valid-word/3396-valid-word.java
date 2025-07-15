class Solution {
    public boolean isValid(String word) {
        boolean valid= false;
        if(word.length()<3) return false;
        
     
        boolean vo=false;
        boolean cons=false;
        
            for(int i=0;i<word.length();i++){
                char c=word.charAt(i);
                if(! Character.isLetterOrDigit(c))
                    return false;
                if(Character.isLetter(c)){
                 char p=Character.toLowerCase(c);
                 
                     if("aeiouAEIOU".indexOf(p)!=-1){
                    vo=true;
                 }
                  else{
                    cons=true;
                    
                }
                }
            }
        
        if(vo && cons){
            valid= true;
        }
        return valid;
    }
}