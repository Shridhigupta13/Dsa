
class Solution {
    public int maxVowels(String s, int k) {

        int n = s.length();
        int count = 0;
        int max = 0;

        for (int i = 0; i < k; i++) {
            char ch = s.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
                count++;
            }
        }
        max = count;
        for (int i = k; i < n; i++) {
            char remove = s.charAt(i - k);

            if (remove == 'a' || remove == 'e' ||
                remove == 'i' || remove == 'o' ||
                remove == 'u') {
                count--;
            }
            char add = s.charAt(i);

            if (add == 'a' || add == 'e' ||
                add == 'i' || add == 'o' ||
                add == 'u') {
                count++;
            }

            max = Math.max(max, count);

            if (max == k) return k;
        }

        return max;
    }
}
