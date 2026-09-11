class Solution {
    public String longestCommonPrefix(String[] strs) {
       String prefix = strs[0];

       for(int i=1; i<strs.length; i++){
        int j = 0;

         for (; j < prefix.length() && j < strs[i].length(); j++) {

                if (prefix.charAt(j) != strs[i].charAt(j)) {
                    break;
                }
            }
            prefix = prefix.substring(0,j);
        } 
        return prefix;
    }

}