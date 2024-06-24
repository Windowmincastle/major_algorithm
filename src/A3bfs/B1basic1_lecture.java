package A3bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class B1basic1_lecture {

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

        for (int i = 0; i < 5; i++) {
            adjList.add(new ArrayList<>()); // 빈 리스트 삽입
        }

        for (int[] a : arr) {
            adjList.get(a[0]).add(a[1]);
            //아래는 양방향일 경우
//            adj.get(a[1]).add(a[0]);
        }
    }

    //  bfs로 짜보기

}
