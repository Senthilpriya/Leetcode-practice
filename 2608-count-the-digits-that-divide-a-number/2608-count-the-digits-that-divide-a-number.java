class Solution 
{
    public int countDigits(int num)
     {
        int rem;
        int t=num;
        int count=0;
        while( num>0)
        {
            rem= num%10;
            if(t%rem==0)
            {
             count++;
            }
            num=num/10;
         } 
        return count;
    }
}