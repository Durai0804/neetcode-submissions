/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        // priority queue
        if(intervals.size()<=0) return 0;
        intervals.sort((a,b) -> a.start - b.start);

        PriorityQueue<Integer> minheap = new PriorityQueue<>();

        minheap.add(intervals.get(0).end);

        for(int i = 1 ;i<intervals.size();i++){
            int start = intervals.get(i).start;

            if(start >= minheap.peek()){
                minheap.poll();
            }
                minheap.add(intervals.get(i).end);
            
        }
        return minheap.size();

    }
}
