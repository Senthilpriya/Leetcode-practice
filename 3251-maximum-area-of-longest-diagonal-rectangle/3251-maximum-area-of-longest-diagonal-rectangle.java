class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int max=0;
        int area=0;
        int p=0;
        for(int i=0;i<dimensions.length;i++){
            for(int j=0;j<dimensions[0].length;j++){
                int length=dimensions[i][0];
                int bre= dimensions[i][1];
                int  dio=(int)( Math.pow(length,2))+(int)(Math.pow(bre,2));
                int pre= length* bre;
               // int gr=(int)(Math.sqrt(dio));
                if(max<dio ||(dio ==max && area<pre)){
                    max=dio;
                    area=pre;
                }

            }
        }
       // int are=dimensions[p][0]*dimensions[p][1];
        return area;
    }
}