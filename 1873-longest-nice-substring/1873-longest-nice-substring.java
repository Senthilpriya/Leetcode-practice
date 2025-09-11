class Solution {
    public String longestNiceSubstring(String s) {
        String upper="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower= "abcdefghijklmnopqrstuvwxyz";
        String res="";
        if (s.length()==1) return "";

    for(int i=0;i<s.length();i++){
        for(int j=i;j<s.length();j++){
            String p=s.substring(i,j+1);
            boolean valid=true;
            int q=0;
            while(q<p.length()){
                char pr=p.charAt(q);
                if(Character.isLowerCase(pr)){
                    
                    if(!p.contains(String.valueOf(Character.toUpperCase(pr)))){
                        valid=false;
                        break;
                    }
                }
               else  if(Character.isUpperCase(pr)){
                    if(!p.contains(String.valueOf(Character.toLowerCase(pr)))){
                        valid=false;
                        break;
                    }
                }
                q++;
            }
            if(valid && res.length()<p.length()){
                res=p;
            }


        }

    }
    return res;
    }
}