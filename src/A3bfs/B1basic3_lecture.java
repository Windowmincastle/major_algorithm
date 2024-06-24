package A3bfs;

import java.util.*;

public class B1basic3_lecture {

    static int[] distance;
    static int[][] arr =
        {{0, 1}, {0, 2}, {1, 3}, {2, 3}, {2, 4}};
    static List<List<Integer>> adjList;
    static boolean[] visited;
    public static void main(String[] args) {
        adjList = new ArrayList<>();
        visited = new boolean[5];
        distance = new int[5];

        for (int i = 0; i < 5; i++) {
            adjList.add(new ArrayList<>()); // 빈 리스트 삽입
        }
//      인접 리스트 생성
        for (int[] a : arr) {
            adjList.get(a[0]).add(a[1]);
        }
        int s = 0;
        int e = 3;
        int mindistance = bfs(s, e);
        System.out.println(mindistance);
    }

    static int bfs(int start, int end) {
        Queue<Integer> q = new LinkedList<>();
        int answer = 0;
        q.add(start);
        visited[0] = true;

        while (!q.isEmpty()) {

            int temp = q.poll();

            for (int target : adjList.get(temp)) {
                if (visited[target] == false) {
                    q.add(target);
                    visited[target] = true;
//                    현재 위치해있는 start = temp에 +1을 해서
                    distance[target] += distance[temp]+1;
                    if (target == target) {
                        return distance[target];
                    }
                }
            }
        }
        return -1;
    }
}
