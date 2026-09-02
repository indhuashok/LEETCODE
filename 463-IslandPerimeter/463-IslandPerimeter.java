// Last updated: 9/2/2026, 2:08:35 PM
1class Solution {
2    public int islandPerimeter(int[][] grid) {
3
4        int perimeter = 0;
5
6        int rows = grid.length;
7        int cols = grid[0].length;
8
9        int[] dr = {-1, 1, 0, 0};
10        int[] dc = {0, 0, -1, 1};
11
12        for (int i = 0; i < rows; i++) {
13
14            for (int j = 0; j < cols; j++) {
15
16                if (grid[i][j] == 1) {
17
18                    // Every land cell has 4 sides
19                    perimeter += 4;
20
21                    // Check 4 directions
22                    for (int k = 0; k < 4; k++) {
23
24                        int ni = i + dr[k];
25                        int nj = j + dc[k];
26
27                        // If neighboring cell is land,
28                        // they share one side
29                        if (ni >= 0 && ni < rows &&
30                            nj >= 0 && nj < cols &&
31                            grid[ni][nj] == 1) {
32
33                            perimeter--;
34                        }
35                    }
36                }
37            }
38        }
39
40        return perimeter;
41    }
42}