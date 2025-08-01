class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        int n=numRows;
        for(int i=0;i<n;i++){
            List<Integer> row= new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    row.add(1);
                }
                else{
                 int sum=list.get(i-1).get(j-1)+list.get(i-1).get(j);
                 row.add(sum);
                }
            }
            list.add(row);
        }
        return list;
    }
}