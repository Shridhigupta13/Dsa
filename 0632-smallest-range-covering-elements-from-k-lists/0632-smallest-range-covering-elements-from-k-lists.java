import java.util.*;

class Solution {
    public int[] smallestRange(List<List<Integer>> nums) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(a[0], b[0])
        );

        int max = Integer.MIN_VALUE;
        int start = 0, end = Integer.MAX_VALUE;

        for (int i = 0; i < nums.size(); i++) {
            int val = nums.get(i).get(0);
            pq.offer(new int[]{val, i, 0});
            max = Math.max(max, val);
        }

        while (true) {
            int[] curr = pq.poll();

            int min = curr[0];
            int list = curr[1];
            int idx = curr[2];

            if (max - min < end - start) {
                start = min;
                end = max;
            }

            if (idx + 1 == nums.get(list).size()) {
                break;
            }

            int nextIdx = idx + 1;
            int nextVal = nums.get(list).get(nextIdx);

            pq.offer(new int[]{nextVal, list, nextIdx});
            max = Math.max(max, nextVal);
        }

        return new int[]{start, end};
    }
}