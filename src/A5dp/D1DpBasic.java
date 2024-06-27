package A5dp;

import java.util.*;

public class D1DpBasic {
    public static void main(String[] args) {
//    베이직 이라기엔 어려운 문제
//    1,4,5로 13을 만들 수 있는 조합 중에 가장 작은 조합의 개수

//        12,9,8 중에 가장 작은 조합을 가진 조합의 개수에 +1
//        Min(f(n-1),f(n-2)...)+1
        int target = 13;
        int[] dp = new int[target+1];
        int[] numbers = {1,4,5};
        dp[1]=1;
        for (int i = 2; i < dp.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int n : numbers) {
                if (i-n>=0 && min > dp[i - n]) {
                    min = dp[i-n];
                }
            }
            dp[i]= Math.min(dp[i-1],dp[i-2])+1;
        }

        System.out.println(Arrays.toString(dp));
        System.out.println(dp[target]);

    }
}

