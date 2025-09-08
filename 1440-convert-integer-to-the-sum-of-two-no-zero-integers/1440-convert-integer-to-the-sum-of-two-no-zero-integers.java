class Solution 
{
    public int[] getNoZeroIntegers(int n) 
    {
        int p=n;
        for(int i=1;i<p;i++)
        {
            for(int j=1;j<p;j++)
            {
                if((i+j)==n)
                {
                    if(!String.valueOf(i).contains("0") && !String.valueOf(j).contains("0")){
                        return new int[]{i,j};
                    }
                
                }

            }
        }
        return  new int[]{0,n};
    }
}