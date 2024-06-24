package A3bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
//이 코드 통으로 외워야해
public class B1basic1_pratice {
    static boolean[] visited = new boolean[5];
    static int[][] arr =
        {
                {0, 1},
                {0, 2},
                {1, 3},
                {2, 3},
                {2, 4}
        };
    static List<List<Integer>> adjList;
    public static void main(String[] args) {

        adjList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            adjList.add(new ArrayList<>()); // 빈 리스트 삽입
        }

        for (int[] a : arr) {
            adjList.get(a[0]).add(a[1]);
        }


//        bfs
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        visited[0] = true; // 초기값은 바로 true

        while (!q.isEmpty()) {

            int temp = q.poll();

            System.out.print(temp+"->");
            for (int target : adjList.get(temp)) {
//              target을 q에 add하기전에 true로 세팅한다.
                if (visited[target] == false) {
                    q.add(target); // 대부분이 안에서 true처리를 한다.
                    visited[target] = true;
                }
            }


        }

    }

}
