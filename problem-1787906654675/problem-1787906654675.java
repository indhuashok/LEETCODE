// Last updated: 8/28/2026, 2:14:14 PM
1class Solution {
2    public List<Integer> findSubstring(String s, String[] words) {
3
4        List<Integer> ans = new ArrayList<>();
5
6        int wordLen = words[0].length();
7        int wordCount = words.length;
8        int totalLen = wordLen * wordCount;
9
10        HashMap<String, Integer> map = new HashMap<>();
11
12        for (String word : words) {
13            map.put(word, map.getOrDefault(word, 0) + 1);
14        }
15
16        // Try each possible offset
17        for (int start = 0; start < wordLen; start++) {
18
19            int left = start;
20            int count = 0;
21
22            HashMap<String, Integer> temp = new HashMap<>();
23
24            for (int right = start;
25                 right + wordLen <= s.length();
26                 right += wordLen) {
27
28                String word = s.substring(right, right + wordLen);
29
30                // Word is not required
31                if (!map.containsKey(word)) {
32                    temp.clear();
33                    count = 0;
34                    left = right + wordLen;
35                    continue;
36                }
37
38                // Add word
39                temp.put(word, temp.getOrDefault(word, 0) + 1);
40                count++;
41
42                // Too many copies of this word
43                while (temp.get(word) > map.get(word)) {
44
45                    String leftWord =
46                        s.substring(left, left + wordLen);
47
48                    temp.put(leftWord, temp.get(leftWord) - 1);
49
50                    left += wordLen;
51                    count--;
52                }
53
54                // All words found
55                if (count == wordCount) {
56                    ans.add(left);
57
58                    // Move window forward
59                    String leftWord =
60                        s.substring(left, left + wordLen);
61
62                    temp.put(leftWord, temp.get(leftWord) - 1);
63
64                    left += wordLen;
65                    count--;
66                }
67            }
68        }
69
70        return ans;
71    }
72}