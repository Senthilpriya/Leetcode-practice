class Solution {
    public int minimumRounds(int[] tasks) {
       Arrays.sort(tasks);
    
        int i=0;
        int end=tasks.length;
        int ans=0;
        while(i<end){
            int count=1;
            while(i+1!=end && tasks[i]==tasks[i+1]){
                count++;
                i++;

            }
           
            if(count==1) return -1;
            if(count%3==0){
                ans+=count/3;
            }
            else{
                ans+=count/3+1;
            }
            i++;

        }
        
       
        return ans;
    }
}
