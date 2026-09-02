// Last updated: 9/2/2026, 1:40:41 PM
1class Solution {
2    public boolean isMatch(String s, String p) {
3        return match(s, p, 0, 0);
4    }
5
6    private boolean match(String s, String p, int i, int j) {
7
8       
9        if (j == p.length()) {
10            return i == s.length();
11        }
12
13        boolean firstMatch =
14                i < s.length() &&
15                (s.charAt(i) == p.charAt(j) ||
16                 p.charAt(j) == '.');
17        if (j + 1 < p.length() && p.charAt(j + 1) == '*') {
18
19            return match(s, p, i, j + 2) ||
20                   (firstMatch && match(s, p, i + 1, j));
21
22        } else {
23            
24            return firstMatch &&
25                   match(s, p, i + 1, j + 1);
26        }
27    }
28}