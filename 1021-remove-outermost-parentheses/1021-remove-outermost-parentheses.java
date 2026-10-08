class Solution {
    public String removeOuterParentheses(String s) {
        String ans = "";
        int bal = 0;
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                if (bal > 0) ans += c;
                bal++;
            } else {
                bal--;
                if (bal > 0) ans += c;
            }
        }
        return ans;
    }
}