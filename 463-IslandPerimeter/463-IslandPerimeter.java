// Last updated: 9/2/2026, 2:11:54 PM
1import java.util.HashMap;
2
3class Solution {
4    public int findShortestSubArray(int[] nums) {
5
6        HashMap<Integer, Integer> count = new HashMap<>();
7        HashMap<Integer, Integer> first = new HashMap<>();
8        HashMap<Integer, Integer> last = new HashMap<>();
9
10        // Find frequency, first occurrence and last occurrence
11        for (int i = 0; i < nums.length; i++) {
12
13            int num = nums[i];
14
15            // Store first occurrence
16            if (!first.containsKey(num)) {
17                first.put(num, i);
18            }
19
20            // Increase frequency
21            count.put(num, count.getOrDefault(num, 0) + 1);
22
23            // Update last occurrence
24            last.put(num, i);
25        }
26
27        // Find degree
28        int degree = 0;
29
30        for (int freq : count.values()) {
31            degree = Math.max(degree, freq);
32        }
33
34        // Find shortest subarray having the same degree
35        int answer = nums.length;
36
37        for (int num : count.keySet()) {
38
39            if (count.get(num) == degree) {
40
41                int length = last.get(num) - first.get(num) + 1;
42
43                answer = Math.min(answer, length);
44            }
45        }
46
47        return answer;
48    }
49}