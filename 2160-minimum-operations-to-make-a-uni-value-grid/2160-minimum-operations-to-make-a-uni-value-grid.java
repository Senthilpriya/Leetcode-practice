import java.util.*;

class Solution {
    public int minOperations(int[][] grid, int x) {
        List<Integer> list = new ArrayList<>();
        
        
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                list.add(grid[i][j]);
            }
        }
        
        
        Collections.sort(list);
        
        
        int median = list.get(list.size() / 2);
        int operations = 0;
        
       
        for (int i = 0; i < list.size(); i++) {
            int diff = Math.abs(list.get(i) - median);
            if (diff % x != 0) return -1; 
            operations += diff / x;
        }
        
        return operations;
    }
}
