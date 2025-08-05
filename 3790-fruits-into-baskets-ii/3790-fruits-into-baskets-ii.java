class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        boolean valid []= new boolean [fruits.length];
        int un= 0;
        for(int i=0;i<fruits.length;i++){
            boolean placed= false;
            for(int j=0;j<fruits.length;j++){
                if(!valid[j] && fruits[i]<=baskets[j]){
                    valid[j]= true;
                    placed= true;
                    break;
                }
            }
            if(!placed){
                un++;
            }

        }
        return un;
    }
}