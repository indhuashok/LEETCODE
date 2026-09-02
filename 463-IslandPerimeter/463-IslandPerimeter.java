// Last updated: 9/2/2026, 2:10:16 PM
1import java.util.HashSet;
2
3class Solution {
4    public int distributeCandies(int[] candyType) {
5
6        HashSet<Integer> set = new HashSet<>();
7
8        for (int candy : candyType) {
9            set.add(candy);
10        }
11
12        return Math.min(set.size(), candyType.length / 2);
13    }
14}