import java.util.*;

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            int n = i;
            boolean valid = true;

            while (n > 0) {
                int digit = n % 10;

                if (digit == 0 || i % digit != 0) {
                    valid = false;
                    break;
                }

                n /= 10;
            }

            if (valid) {
                ans.add(i);
            }
        }

        return ans;
    }
}