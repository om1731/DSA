import java.util.*;

class Solution {
    static class Pair {
        long first;
        int second;

        Pair(long first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    public int countPaths(int n, int[][] roads) {
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] road : roads) {
            adj.get(road[0]).add(new Pair(road[2], road[1]));
            adj.get(road[1]).add(new Pair(road[2], road[0]));
        }

        PriorityQueue<Pair> pq =
            new PriorityQueue<>((a, b) -> Long.compare(a.first, b.first));

        long[] dist = new long[n];
        int[] ways = new int[n];
        Arrays.fill(dist, Long.MAX_VALUE);

        int mod = 1_000_000_007;
        dist[0] = 0;
        ways[0] = 1;
        pq.add(new Pair(0, 0));

        while (!pq.isEmpty()) {
            Pair curr = pq.poll();
            long dis = curr.first;
            int node = curr.second;

            if (dis > dist[node]) continue;

            for (Pair it : adj.get(node)) {
                int adjNode = it.second;
                long edw = it.first;
                long newDist = dis + edw;

                if (newDist < dist[adjNode]) {
                    dist[adjNode] = newDist;
                    ways[adjNode] = ways[node];
                    pq.add(new Pair(newDist, adjNode));
                } else if (newDist == dist[adjNode]) {
                    ways[adjNode] = (int)
                        (((long) ways[adjNode] + ways[node]) % mod);
                }
            }
        }

        return ways[n - 1];
    }
}