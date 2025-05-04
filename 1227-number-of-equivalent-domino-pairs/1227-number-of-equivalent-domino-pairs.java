class Solution {
    public int numEquivDominoPairs(int[][] dominos) {
        int start=0;
        int end=0;
        int count=0;
        for(int i=0;i<dominos.length;i++){
            int a1=dominos[i][0];
            int b1=dominos[i][1];
            for(int j=i+1;j<dominos.length;j++){
               int a2=dominos[j][0];
               int b2=dominos[j][1];
               if((a1==a2 && b1==b2 )|| a1==b2&& b1==a2)
               {
                count++;
               }
            }
        }
        return count;
    }
}