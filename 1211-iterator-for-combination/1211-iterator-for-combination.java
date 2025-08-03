class CombinationIterator {
    String c;
    int len;
    String state;

    public CombinationIterator(String characters, int combinationLength) {
        this.c=characters;
        this.len = combinationLength;
        this.state="";
    }
    
    public String next() {
        if(state.equals(""))state = c.substring(0, len);
        else{
            int end = (commonPref(new StringBuilder(c).reverse(), new StringBuilder(state).reverse())).length();
            int place = c.indexOf(state.charAt(state.length() - end-1));
            state = state.substring(0, state.length()-end-1) + c.substring(place+1, place+2+end);
        }
        return state;
    }

    public String commonPref(StringBuilder s1, StringBuilder s2){
        StringBuilder s = new StringBuilder();
        int i=0;
        while(i<s1.length() && i<s2.length()){
            if(s1.charAt(i)!=s2.charAt(i))break;
            s.append(s1.charAt(i));
            i++;
        }
        return s.toString();
    }
    
    public boolean hasNext() {
        return !state.equals(c.substring(c.length()-len, c.length()));
    }
}

/**
 * Your CombinationIterator object will be instantiated and called as such:
 * CombinationIterator obj = new CombinationIterator(characters, combinationLength);
 * String param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */