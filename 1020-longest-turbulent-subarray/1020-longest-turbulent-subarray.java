class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int l=0;int r=1; int maxlen =1 ;
        while(r!=arr.length){
            if(r+1<arr.length && arr[r-1] > arr[r] && arr[r] < arr[r+1]){
                r+=2;
                maxlen = r-l>maxlen ? r-l : maxlen;
                
            }else if(arr[r-1] > arr[r]) {
                    r++;
                   maxlen = r-l>maxlen ? r-l : maxlen;
                   l = r-1;
            }else{
                r++;
                l = r-1;
            }
        }
        l=0; r=1;
        while(r!=arr.length){
            if(r+1 < arr.length && arr[r-1] < arr[r] && arr[r] > arr[r+1]){
                r+=2;
                maxlen = r-l>maxlen ? r-l : maxlen;
            }else if(arr[r-1] < arr[r]) {
                    r++;
                   maxlen = r-l>maxlen ? r-l : maxlen;
                   l = r-1;
            }else{
                r++;
                l = r-1;
            }
        }
        return maxlen;
    }
}