class Solution {
    public String makeFancyString(String s) {
        StringBuilder p= new StringBuilder();
        int count=1;
        p.append(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                count++;
            }
            else{
                count=1;
            }
           if(count<3){
            p.append(s.charAt(i));
           }

        }
        return p.toString();
    }
}