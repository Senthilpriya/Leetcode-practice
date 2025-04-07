import java.util.*;

class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0])); 
        
        List<int[]> mergedMeetings = new ArrayList<>();
        for (int[] meeting : meetings) {
            if (mergedMeetings.isEmpty() || mergedMeetings.get(mergedMeetings.size() - 1)[1] < meeting[0] - 1) {
                mergedMeetings.add(meeting); 
            } else {
                
                mergedMeetings.get(mergedMeetings.size() - 1)[1] = 
                    Math.max(mergedMeetings.get(mergedMeetings.size() - 1)[1], meeting[1]);
            }
        }

        
        int availableDays = 0, prevEnd = 0;
        for (int[] interval : mergedMeetings) {
            availableDays += (interval[0] - prevEnd - 1); 
            prevEnd = interval[1]; 
        }

        availableDays += (days - prevEnd); 
        return availableDays;
    }
}

