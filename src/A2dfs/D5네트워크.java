package A2dfs;

public class D5네트워크 {

    static int n = 3;
    static boolean[] visited;
    static int line = 0;

    // 1번 예시
    static int[][] com = {{1,1,0}, {1,1,0}, {0,0,1}};
    // 2번 예시
    static int[][] com2 = {{1, 1, 0}, {1, 1, 1}, {0, 1, 1}};

    public static void main(String[] args) {

        visited = new boolean[n];

        // 각 컴퓨터에 대해서 dfs를 호출한다.
        for (int i = 0; i < com.length; i++) {
            dfs(i);
        }
        System.out.println( n - line);

    }

    static void dfs(int i) {

        visited[i] = true; // i에 대해 방문 처리를 한다.

        // i에 연결된 모든 컴퓨터 j를 탐색한다.
        for (int j = 0; j < com[i].length; j++) {
            //간선의 개수를 센다.
            if (com[i][j] == 1 && !visited[j]) {
                line++;
                dfs(j);

            }
        }
    }

}
