class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==-2147483648&& divisor==-1)
         return 2147483647;
         return dividend/divisor;

        // int ans=0;
        // int sum=0;
        // int count=0;

        // while(sum+divisor<=dividend){
        // sum+= divisor;
        // count++;

        // divisor=ans;
        // System.out.println(ans);
        // break;
        // }
        // return ans;
    }
}
