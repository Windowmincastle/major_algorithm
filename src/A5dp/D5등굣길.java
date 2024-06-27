package A5dp;

import java.util.Arrays;

public class D5등굣길 {
    public static void main(String[] args) {
        int m = 4;
        int n = 3;
        int[][] puddles = {{2, 2}};
        int[][] dp = new int[n][m];

        // 첫 번째 행과 첫 번째 열을 초기화합니다.
        for (int i = 0; i < n; i++) {
            dp[i][0] = 1;
        }
        for (int i = 0; i < m; i++) {
            dp[0][i] = 1;
        }

        // 웅덩이 표시하기
        for (int[] puddle : puddles) {
            int x = puddle[0] - 1;
            int y = puddle[1] - 1;
            dp[y][x] = -1;
        }

        // DP 테이블 채우기
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (dp[i][j] == -1) {
                    dp[i][j] = 0;
                } else {
                    if (dp[i - 1][j] != -1) {
                        dp[i][j] += dp[i - 1][j];
                    }
                    if (dp[i][j - 1] != -1) {
                        dp[i][j] += dp[i][j - 1];
                    }
                }
            }
        }

        // 출력
        System.out.println(Arrays.deepToString(dp) + "\n");
        System.out.println(dp[n - 1][m - 1] % 1000000007);
    }
}

class Solution_2 {
    public int solution(int m, int n, int[][] puddles) {
        int MOD = 1000000007;
        int[][] dp = new int[n][m];

        // 웅덩이 표시하기
        for (int[] puddle : puddles) {
            int x = puddle[0] - 1;
            int y = puddle[1] - 1;
            dp[y][x] = -1;
        }

        // 첫 번째 행과 첫 번째 열 초기화
        for (int i = 0; i < n; i++) {
            if (dp[i][0] == -1) break;
            dp[i][0] = 1;
        }
        for (int i = 0; i < m; i++) {
            if (dp[0][i] == -1) break;
            dp[0][i] = 1;
        }

        // DP 테이블 채우기
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (dp[i][j] == -1) {
                    dp[i][j] = 0;
                } else {
                    if (dp[i - 1][j] != -1) {
                        dp[i][j] = (dp[i][j] + dp[i - 1][j]) % MOD;
                    }
                    if (dp[i][j - 1] != -1) {
                        dp[i][j] = (dp[i][j] + dp[i][j - 1]) % MOD;
                    }
                }
            }
        }

        return dp[n - 1][m - 1];
    }
}

