class Solution {
    public String predictPartyVictory(String senate) {
        int n = senate.length();
        int cntR = 0, cntD = 0;
        while( n > 1){
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < n; i++){
                char ch = senate.charAt(i);
                if(ch == 'R'){
                    if(cntD == 0){
                        sb.append(ch);
                        cntR++;
                    }
                    else cntD--;
                }
                if(ch == 'D'){
                    if(cntR == 0) {
                        sb.append(ch);
                        cntD++;
                    }
                    else cntR--;
                }
            }
            n = sb.length();
            if(cntR == n || cntD == n) break;
            int temp = Math.max(cntR, cntD);
            if(temp == 0) senate = sb.toString();
            else{
                String subLast = sb.substring(n - temp);
                senate = subLast + sb;
            }
            cntR = 0;
            cntD = 0;
        }
        if(senate.charAt(0) == 'R') return "Radiant";
        return "Dire";
    }
}