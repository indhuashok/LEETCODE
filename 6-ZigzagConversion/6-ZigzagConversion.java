// Last updated: 8/11/2026, 11:29:44 AM
class Solution {
    public String convert(String s, int r) {
        if (r == 1) {
            return s;
        }
        StringBuilder[] rows = new StringBuilder[r];
        for (int i = 0; i < r; i++) {
            rows[i] = new StringBuilder();
        }
        int d = 1;
        int row = 0;
        for (char c : s.toCharArray()) {
            rows[row].append(c);
            if (row == 0) {
                d = 1;
            } else if (row == r - 1) {
                d = -1;
            }
            row += d;
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < r; i++) {
            res.append(rows[i]);
        }
        return res.toString();
    }
}