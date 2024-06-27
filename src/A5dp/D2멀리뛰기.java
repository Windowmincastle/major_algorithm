package A5dp;

public class D2멀리뛰기 {

    public static void main(String[] args) {

    }
}

class Solution {
    public long solution(int n) {
//        n = 멀리뛰기 칸
        long answer = 0;

        //기억하기 방식
//      점화식 : f(n) = f(n-1) + f(n-2)
//      일반적으로 배열에 담는다.

//        헷갈리면 +1해서 1-based로 만들어라
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i-1]+dp[i-2];
        }

        answer = dp[n+1];
        return answer;
    }
}