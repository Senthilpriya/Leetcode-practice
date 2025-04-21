class Solution {
    public int[] sortByBits(int[] arr) {
        Integer t[]=new Integer[arr.length];
        for(int i=0;i<arr.length;i++){
            t[i]=arr[i];
        }
        Arrays.sort(t, (a, b) -> {
            int bitsA = Integer.bitCount(a);
            int bitsB = Integer.bitCount(b);
            
            if (bitsA == bitsB) {
                return a - b;  
            } else {
                return bitsA - bitsB;  
            }
        });
        for(int i=0;i<arr.length;i++){
            arr[i]=t[i];
        }
        return arr;
    }
}