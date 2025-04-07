class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int sumro=0;
        int m=rolls.length;
        for(int i=0;i<rolls.length;i++){
            sumro+=rolls[i];
        }
        int mul=n+m;
        int arr[]= new int[n];
        int sumn=(mean *(n+m)) -sumro;
        System.out.println(sumn);
        if(sumn< 1*n ||  sumn> 6*n)
            return new int[0];     
        int avg=sumn/n;
        int rem=sumn%n;
        for(int i=0;i<n;i++){
            arr[i]=avg+(i<rem?1:0);
        }
        return arr;
    }
}