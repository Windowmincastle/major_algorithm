package 코딩페스티벌;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 아기상어 {

    //상하좌우 대각선
    static int[] di ={-1,+1,0,0,-1,+1,-1,+1};
    static int[] dj= {0,0,-1,+1,+1,-1,-1,+1};
    static Queue<int[]> q = new LinkedList<>();
    static boolean[][] visited;
//    static int[][] distance
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        // 배열의 크기 N을 입력받기
        int N = Integer.parseInt(sc.nextLine());
        int M = Integer.parseInt(sc.nextLine());

        int[][] map = new int[N][N]; // N x N 크기의 2차원 배열 선언
        visited = new boolean[N][M];


        // 2차원 배열 입력 받기
        for (int i = 0; i < N; i++) {
            // 한 줄을 읽어와서 공백으로 구분하여 배열로 변환
            String[] line = sc.nextLine().split(" ");
            for (int j = 0; j < M; j++) {
                // 각 값을 정수로 변환하여 배열에 저장
                map[i][j] = Integer.parseInt(line[j]);
            }
        }

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {

                if (map[i][j] == 0) {

                    int x = i;
                    int y = j;

                    visited[x][y] = true;
                    q.add(new int[]{x, y});
                    while (!q.isEmpty()) {
                        int[] current = q.poll();
                        int curx = current[0];
                        int cury = current[1];
                        for (int k = 0; k < 8; k++) {

                            int nextX = curx + di[i];
                            int nextY = cury + di[y];

                            if (nextX < 0 || nextX >= map.length || nextY < 0 || nextY >= map[0].length) {
                                continue;
                            }

                            if ( !visited[nextX][nextY] && map[nextX][nextY] == 0) {
                                map[nextX][nextY] = map[curx][cury] + 1;
                                q.add(new int[]{nextX, nextY});
                            }
                        }
                    }
                }
            }
        }

        System.out.println(Arrays.deepToString(map));

    }

}
