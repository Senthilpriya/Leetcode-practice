

class Solution {
    public int numRabbits(int[] answers) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int a : answers) {
            count.put(a, count.getOrDefault(a, 0) + 1);
        }

        int result = 0;
        for (int x : count.keySet()) {
            int groupSize = x + 1;
            int groups = (count.get(x) + groupSize - 1) / groupSize; 
            result += groups * groupSize;
        }

        return result;
    }
}
