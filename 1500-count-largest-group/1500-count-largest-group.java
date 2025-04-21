class Solution {
    public int countLargestGroup(int n) {
        Map<Integer , Integer> map=new HashMap<>();
    for(int i=1;i<=n;i++){
        int sum=0;
        int num=i;
        while(num>0){
            int rem=num%10;
            sum+=rem;
            num/=10;
        }
        map.put(sum,map.getOrDefault(sum,0)+1);

    }
    int count=0;
    int max=0;
    for(int i:map.values()){
        max=Math.max(max,i);
    }
    for(int i:map.values()){
        if(i==max){
            count++;
        }
    }
    return count;
    }
}