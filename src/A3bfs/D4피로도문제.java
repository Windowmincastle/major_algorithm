package A3bfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class D4피로도문제 {

    static List<List<Integer>> list = new ArrayList<>();
    static int k = 80;
    static int[][] dgs = {
//                0번 던전의 최소필요 피로도 80, 소모 피로도 20
            {80, 20},
            {50,40},
            {30,10}
    };
    static int max;
    static boolean visited[] = new boolean[dgs.length];

    static int dfs(int start) {

        int cnt =0;
        int p = list.get(start).get(0);
        int so = list.get(start).get(1);
        k =- so; // 소모 피로도 뺴주고
        cnt++; // 카운트 +1

        if (k > list.get(start + 1).get(0)) {
            dfs(start + 1);
            max = cnt;
        }

        return max;
    }

    public static void main(String[] args) {
        int answer = 0;

        for (int i = 0; i < dgs.length; i++) {
            list.add(new ArrayList<>()); // 내부에 10개 인접 리스트 표현을 생성하고
        }

        for (int i = 0; i < dgs.length; i++) {
            for (int j = 0; j < dgs[0].length; j++) {
                list.get(dgs[i][j]).add(dgs[i][j]);
            }
        }

        System.out.println(list);
//        answer = dfs(0);


    }
}
