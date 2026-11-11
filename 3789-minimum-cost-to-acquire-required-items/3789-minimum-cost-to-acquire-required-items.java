
class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth,
                            int need1, int need2) {

        long case1 = (long) need1 * cost1
                   + (long) need2 * cost2;

        long case2 = (long) Math.max(need1, need2) * costBoth;

        int minNeed = Math.min(need1, need2);

        long case3 = (long) minNeed * costBoth
                   + (long) (need1 - minNeed) * cost1
                   + (long) (need2 - minNeed) * cost2;

        return Math.min(case1, Math.min(case2, case3));
    }
}
