/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijkstra;
import java.util.Arrays;
import java.util.PriorityQueue;
/**
 *
 * @author User
 */
public class Dijkstra {

    /**
     * @param args the command line arguments
     */
        static int[] dist;
        static boolean[] visited;
        static int[][] graph;
        static int N = 6;
    
        static void dijkstra(int src) {
            dist = new int[N];
            visited = new boolean[N];
            Arrays.fill(dist, Integer.MAX_VALUE);
            dist[src] = 0;
    
            PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> dist[a] - dist[b]);
            pq.offer(src);
    
            while (!pq.isEmpty()) {
                int u = pq.poll();
                if (visited[u]) continue;
                visited[u] = true;
    
                for (int v = 0; v < N; v++) {
                    if (graph[u][v] != Integer.MAX_VALUE && !visited[v]) {
                        int newDist = dist[u] + graph[u][v];
                        if (newDist < dist[v]) {
                            dist[v] = newDist;
                            pq.offer(v);
                        }
                    }
                }
            }
        }
    public static void main(String[] args) {
        graph = new int[N][N];
        for (int i = 0; i < N; i++) {
            Arrays.fill(graph[i], Integer.MAX_VALUE);
        }
        graph[0][1] = 5;
        graph[0][3] = 9;
        graph[1][2] = 12;
        graph[1][3] = 2;
        graph[2][4] = 3;
        graph[3][2] = 4;
        graph[3][4] = 5;
        graph[3][5] = 20;
        graph[4][5] = 8;

        dijkstra(0);
        System.out.println("The shortest distance from 0 to 5 is: " + dist[5]);
    }
}
