class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        for(int i=1;i<=6;i++){
            int top=0;
            int bottom=0;
            boolean flag=true;;
            for(int j=0;j<tops.length;j++){
                if(tops[j]!=i && bottoms[j]!=i){
                 flag=false;
                 break;
                }
                else if(tops[j]!=i){
                    top++;
                }
                else if(bottoms[j]!=i){
                    bottom++;
                }
            }
        if(flag){
            return Math.min(top,bottom);
        }
        }
        return -1;

    }
}