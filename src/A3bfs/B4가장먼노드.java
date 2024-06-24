package A3bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class B4가장먼노드 {

    static List<List<Integer>> adjList;
    static boolean[] visited;
    static int[] distance;
    public static int solution(int n, int[][] edge) {

        int answer = 0;
        adjList = new ArrayList<>();
        visited = new boolean[n];
        distance = new int[n];

        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int[] e : edge) {
            adjList.get(e[0]).add(e[1]);
        }

        answer = bfs(0);
        return answer;
    }

    static int bfs(int start) {
        int max = 0;
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;
        while (!q.isEmpty()) {
            int temp = q.poll();

            for (int target : adjList.get(temp)) {
                q.add(target);
                visited[target] = true;

            }
        }


        return -1;
    }

    public static void main(String[] args) {

        int n = 6;
        int [][] vertex = {
                {3,6},
                {4,3},
                {3,2},
                {1,3},
                {1,2},
                {2,4},
                {5,2}
        };
    }
}
