package A3bfs;

import java.util.LinkedList;
import java.util.Queue;

public class B6게임맵강사님 {

//    static int[] DX = {1,0,-1, 0};
//    static int[] DY = {0,1, 0,-1};

    public static void main(int[][] maps) {

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0, 0, 1});
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        //방문 배열
        boolean[][] visited = new boolean[maps.length][maps[0].length];
        maps[0][0] = -1;

        while (!q.isEmpty()) {

            int answer = -1;
            int[] cur = q.poll();


            for (int i = 0; i < 4; i++) {
                int nx = cur[0] + dx[i];
                int ny = cur[1] + dy[i];

                if (nx >= 0 && nx < maps.length && ny >= 0 && ny < maps[0].length) {

                    if (maps[nx][ny] == 1) {
                        q.add(new int[]{nx, ny, (cur[2] + 1)});
                        maps[nx][ny] = -1;

                        if (nx == maps.length - 1 && ny == maps[0].length - 1) {
                            answer = cur[2] + 1;
                            break;
                        }

                    }
                }
            }
        }
    }

//    static void bfs(int[][] maps, int[][] distance) {
//
//        int x =0;
//        int y =0;
//        distance[x][y] = 1;
//
//        Queue<int[]> q = new LinkedList<>();
//        q.add(new int[]{x, y});
//
//        while (!q.isEmpty()) {
//
//            int[] current = q.poll();
//            int curx = current[0];
//            int cury = current[1];
//
////            상하좌우 4번
//            for (int i = 0; i < 4; i++) {
//
//                int nextX = curx = DX[i];
//                int nextY = cury = DY[i];
//
//                if (nextX < 0 || nextX >= maps.length || nextY < 0 || nextY >= maps[0].length) {
//                    continue;
//                }
//
//                if (distance[nextX][nextY] == 0 && maps[nextX][nextY] == 1) {
//                    distance[nextX][nextY] = distance[curx][cury] +1;
//                    q.add(new int[]{nextX, nextY});
//                }
//            }
//
//        }
//    }

}
