package A3bfs;

import java.util.LinkedList;
import java.util.Queue;

public class B6게임맵 {

    static int[] DX = {1,0,-1,0};
    static int[] DY = {0, 1, 0, -1};

    public static int main(int[][] maps) {

        int[][] distance = new int[maps.length][maps[0].length];

        bfs(maps, distance);

        int result = distance[maps.length - 1][maps[0].length - 1];

        return (result == 0) ? -1 : result;
    }

    static void bfs(int[][] maps, int[][] distance) {

        int x =0;
        int y =0;
        distance[x][y] = 1;

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y});

        while (!q.isEmpty()) {

            int[] current = q.remove();
            int curx = current[0];
            int cury = current[1];

//            상하좌우 4번
            for (int i = 0; i < 4; i++) {

                int nextX = curx = DX[i];
                int nextY = cury = DY[i];

                if (nextX < 0 || nextX >= maps.length || nextY < 0 || nextY >= maps[0].length) {
                    continue;
                }

                if (distance[nextX][nextY] == 0 && maps[nextX][nextY] == 1) {
                    distance[nextX][nextY] = distance[curx][cury] +1;
                    q.add(new int[]{nextX, nextY});
                }
            }

        }
    }

}
