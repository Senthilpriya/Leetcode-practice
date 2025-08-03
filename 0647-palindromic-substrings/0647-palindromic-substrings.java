class Solution {
    public int countSubstrings(String s) {
           int n = s.length();
        int cnt = 0;
        boolean[][] t = new boolean[n][n];
        for(int L=1;L<=n;L++){
            for(int i=0; i+L-1 < n; i++){
                int j = i+L-1;
                if(i==j) t[i][j]=true;
                else if(i+1 == j) t[i][j] = s.charAt(i)==s.charAt(j);
                else{
                    t[i][j] = ((s.charAt(i)==s.charAt(j)) && t[i+1][j-1]);
                }
                if(t[i][j]) cnt++;
            }
        }
        return cnt;
    }    
}