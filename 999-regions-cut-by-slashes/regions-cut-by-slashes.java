public class Solution {

    public int regionsBySlashes(String[] grid) {
        int n = grid.length;
        int size = 3 * n; // Since each cell is expanded to a 3x3 block
        int[][] graph = new int[size][size];

        // Fill the expanded grid
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i].charAt(j) == '/') {
                    graph[3 * i][3 * j + 2] = 1;
                    graph[3 * i + 1][3 * j + 1] = 1;
                    graph[3 * i + 2][3 * j] = 1;
                } else if (grid[i].charAt(j) == '\\') {
                    graph[3 * i][3 * j] = 1;
                    graph[3 * i + 1][3 * j + 1] = 1;
                    graph[3 * i + 2][3 * j + 2] = 1;
                }
            }
        }

        // Count regions using DFS
        int regions = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (graph[i][j] == 0) {
                    dfs(graph, i, j);
                    regions++;
                }
            }
        }

        return regions;
    }

    private void dfs(int[][] graph, int x, int y) {
        int n = graph.length;
        if (x < 0 || x >= n || y < 0 || y >= n || graph[x][y] == 1) {
            return;
        }

        graph[x][y] = 1; // Mark the cell as visited
        dfs(graph, x - 1, y);
        dfs(graph, x + 1, y);
        dfs(graph, x, y - 1);
        dfs(graph, x, y + 1);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] grid1 = {
            " /",
            "/ "
        };
        System.out.println(solution.regionsBySlashes(grid1)); // Output: 2

        String[] grid2 = {
            " /",
            "  "
        };
        System.out.println(solution.regionsBySlashes(grid2)); // Output: 1

        String[] grid3 = {
            "//",
            "/ "
        };
        System.out.println(solution.regionsBySlashes(grid3)); // Output: 3
    }
}
