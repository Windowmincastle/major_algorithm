package A2dfs;
import java.util.ArrayList;
import java.util.List;

//구현 못 햇음 다시 해보기-> 망함

public class D3Basic_Pratice {

//    1부터 시작 -> list,배열 1개 넉넉하게 잡으면 된다.
//    방문경로를 모두 list에 담기

    static int[][] arr ={
        {1,2},
        {1,3},
        {2,4},
        {2,5},
        {3,6},
        {3,7},
        {4,8},
        {4,9},
        {5,10}
    };
    static List<List<Integer>> adjList;
    static boolean[] visited = new boolean[arr.length+1];
    static List<List<Integer>> answer;
    public static void main(String[] args) {

        for (int i = 0; i < arr.length; i++) {
            adjList.add(new ArrayList<>()); // 내부에 10개 인접 리스트 표현을 생성하고
            answer.add(new ArrayList<>()); // 정답 리스트 생성.
//            백트래킹을 하면 다음 순서로 넘어가야함.
        }

        for (int[] a : arr) {
            System.out.println(a[0]);
        }

        for (int[] a : arr) {
            adjList.get(a[0]).add(a[1]);
        }

        dfs(0);
    }

    static void dfs(int node) {

        visited[node] = true;

        for (int target : adjList.get(node)) {
            if (visited[target] == false) {
                dfs(target);
            }

        }



    }
}
