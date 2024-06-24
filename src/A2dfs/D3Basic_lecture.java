package A2dfs;

import java.util.ArrayList;
import java.util.List;

public class D3Basic_lecture {

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

    static List<List<Integer>> adjList = new ArrayList<>();

    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {
            adjList.add(new ArrayList<>()); // 내부에 10개 인접 리스트 표현을 생성하고

        }

        for (int[] a : arr) {
            adjList.get(a[0]).add(a[1]);
        }

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
//        1번 노드부터 시작
        dfs(ans,temp,1);

        System.out.println(ans);
    }

    static void dfs(List<List<Integer>> ans,List<Integer> temp,int node) {

        if (adjList.get(node).isEmpty()) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for (int target : adjList.get(node)) {
            temp.add(target);
            dfs(ans, temp, target);
            temp.remove(temp.size() - 1);
        }
    }


}
