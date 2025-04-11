class Solution {
    public List<String> cellsInRange(String s) {
        // SAMPLE:     "A1:F1"
        char colStart = s.charAt(0);
        char rowStart = s.charAt(1);
        char colEnd = s.charAt(3);
        char rowEnd = s.charAt(4);

        List<String> res = new ArrayList<>();

        for (char c = colStart; c <= colEnd; c++){
            for (char r = rowStart; r <= rowEnd; r++){
                res.add(new String(new char[]{c, r}));
            }
        }

        return res;
    }
}