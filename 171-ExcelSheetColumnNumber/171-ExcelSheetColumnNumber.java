// Last updated: 8/11/2026, 11:27:18 AM
class Solution {
    public int titleToNumber(String columnTitle) {

        int result = 0;

        for(int i = 0; i < columnTitle.length(); i++) {

            char ch = columnTitle.charAt(i);

            result = result * 26 + (ch - 'A' + 1);
        }

        return result;
    }
}