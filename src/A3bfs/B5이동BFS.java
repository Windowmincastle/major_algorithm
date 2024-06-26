package A3bfs;

import java.util.LinkedList;
import java.util.Queue;

// 6.25일 이 문제 실패했으니까 다음에 다시 풀어보기
public class B5이동BFS {

    static boolean[] vistied;
    static Queue<Integer> q;
    public static void main(String[] args) {
        int start = 5;
        int target = 17;

        int ans = bfs(start, target);
        System.out.println(ans);

//        -1, +1, 현재숫자 *2 ?
    }

    static int bfs(int s, int target) {
        int answer = 0;
        q = new LinkedList<>();
        vistied = new boolean[target*50];

        q.add(s);
        vistied[s] = true;
        int cnt = 0;
        while (!q.isEmpty()) {

            int temp = q.poll();

            System.out.println(temp+" temp값 찎어보기 ");

            if (temp == target) {
                return answer;
            }

            for (int i = 0; i < 3; i++) {

                if (!vistied[temp-1]) {
                    q.add(temp - 1);
                    vistied[temp] = true;
                }

                if (!vistied[temp+1]) {
                    q.add(temp +1);
                    vistied[temp] = true;
                }

                if (!vistied[temp*2]) {
                    q.add(temp*2);
                    vistied[temp*2] = true;
                }

            }
            answer++;
        }

        return answer;
    }
}
