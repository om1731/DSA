import java.util.*;

class tuple {
    int first, second, third;

    tuple(int _first, int _second, int _third) {
        this.first = _first;
        this.second = _second;
        this.third = _third;
    }
}

class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        if (grid[0][0] == 1 || grid[n - 1][m - 1] == 1)
            return -1;

        Queue<tuple> q = new LinkedList<>();
        int[][] dist = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                dist[i][j] = (int) (1e9);
            }
        }

        dist[0][0] = 1;
        q.add(new tuple(1, 0, 0));

        int dr[] = {-1, -1, -1, 0, 0, 1, 1, 1};
        int dc[] = {-1, 0, 1, -1, 1, -1, 0, 1};

        while (!q.isEmpty()) {
            tuple it = q.peek();
            q.remove();

            int dis = it.first;
            int r = it.second;
            int c = it.third;

            if (r == n - 1 && c == m - 1)
                return dis;

            for (int i = 0; i < 8; i++) {
                int newr = r + dr[i];
                int newc = c + dc[i];

                if (newr >= 0 && newr < n &&
                    newc >= 0 && newc < m &&
                    grid[newr][newc] == 0 &&
                    dis + 1 < dist[newr][newc]) {

                    dist[newr][newc] = dis + 1;
                    q.add(new tuple(dis + 1, newr, newc));
                }
            }
        }

        return -1;
    }
} 