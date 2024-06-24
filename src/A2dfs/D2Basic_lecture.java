package A2dfs;

import java.util.ArrayList;
import java.util.List;
// 수정 필요
public class D2Basic_lecture {

    //   양방향 그래프
    static int[][] adj = {
            {0, 1},
            {0, 2},
            {1, 3},
            {2, 3},
            {3, 5},
            {2, 4}
    };
    //    결과 0->1->3->2->4->5
    static boolean[] visited = new boolean[6];
    static List<List<Integer>> adjList = new ArrayList<>();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {

//        내부 리스트 생성
        for (int i = 0; i < 5; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int[] a : adj) {
//            양방향
            adjList.get(a[0]).add(a[1]);
            adjList.get(a[1]).add(a[0]);
        }

    }

    static void dfs(int node) {

        System.out.println(node);
        visited[node] = true;
//      방문 처리

//      탈출 조건
        for (int n : adjList.get(node)) {
            if (visited[n] == false) {
                dfs(node);
            }
        }
    }

}
