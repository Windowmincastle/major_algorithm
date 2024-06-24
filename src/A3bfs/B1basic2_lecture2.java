package A3bfs;

import java.util.ArrayList;
import java.util.List;

public class B1basic2_lecture2 {

    static int[][] arr =
        {{0, 1}, {0, 2}, {1, 3}, {2, 3}, {2, 4}};
    static List<List<Integer>> adjList;
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            adjList.add(new ArrayList<>()); // 빈 리스트 삽입
        }

        for (int[] a : arr) {
            adjList.get(a[0]).add(a[1]);
        }
    }
}
