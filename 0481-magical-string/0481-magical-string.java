class Solution {
    public int magicalString(int n) {
        StringBuilder sb = new StringBuilder("122");
        int i = 2;
        int j = 2;
        int cnt = 1;
        char next = '1';
        while(sb.length()<=n) {
            if(sb.charAt(i) == '2') {
                sb.append(next);
                sb.append(next);
            } else {
                sb.append(next);
            }
            while(j<n && j<sb.length()){
                cnt+=sb.charAt(j) == '1' ? 1:0;
                j++;
            }
            if(j == n) break;
            next = next == '1' ? '2':'1';
            i++;
        }
        // for(int k = 0;k<n;k++){
        //     cnt+= sb.charAt(k) == '1'?1:0;
        // }
        return cnt;
    }
}