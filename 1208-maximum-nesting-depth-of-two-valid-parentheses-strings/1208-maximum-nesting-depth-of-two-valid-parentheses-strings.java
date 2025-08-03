class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int n = seq.length () ,s1 =0, s2 = 0;
        int[] ans = new int [n] ;
        for ( int i = 0 ; i < n ; i ++ ){
            if ( seq.charAt (i) =='(' ){
                if ( s1 <= s2){
                    s1 ++;
                    ans[i] = 0;
                }
                else {
                    s2 ++;
                    ans [i] = 1 ;
                }
            }
            else {
                if ( s1 > s2){
                    s1 -- ;
                    ans [i] = 0 ;
                }
                else {
                    s2 --;
                    ans [i] = 1 ;
                }
            }
        }
        return ans ;
    }
}