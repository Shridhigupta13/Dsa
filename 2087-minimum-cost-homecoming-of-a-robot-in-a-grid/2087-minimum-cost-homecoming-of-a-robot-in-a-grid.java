
class Solution {
    public int minCost(int[] startPos, int[] homePos, int[] rowCosts, int[] colCosts) {

        int cost = 0;
        int row = startPos[0];
        int col = startPos[1];
        while (row < homePos[0]) {
            row++;
            cost += rowCosts[row];
        }

        while (row > homePos[0]) {
            row--;
            cost += rowCosts[row];
        }

        while (col < homePos[1]) {
            col++;
            cost += colCosts[col];
        }

        while (col > homePos[1]) {
            col--;
            cost += colCosts[col];
        }

        return cost;
    }
}
