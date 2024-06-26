package A2dfs;

//개인 과제
public class D6타겟넘버 {

    class Solution {
        // dfs 메서드: 주어진 숫자 배열과 타겟을 사용하여 가능한 경우의 수를 찾음
        private int dfs(int[] numbers, int target, int curSum, int curIdx) {

            // 현재 인덱스가 숫자 배열의 길이와 같다면 모든 숫자를 다 사용한 것
            if (curIdx == numbers.length) {
                // 현재 합계가 타겟 값과 같다면 1을 반환 (경우의 수 하나 추가)
                if (curSum == target) {
                    return 1;
                } else {
                    // 그렇지 않다면 경우의 수는 0
                    return 0;
                }
            } else {
                // 경우의 수를 저장할 변수
                int ans = 0;
                // 현재 숫자를 더하는 경우의 수를 재귀적으로 탐색
                ans += dfs(numbers, target, curSum + numbers[curIdx], curIdx + 1);
                // 현재 숫자를 빼는 경우의 수를 재귀적으로 탐색
                ans += dfs(numbers, target, curSum - numbers[curIdx], curIdx + 1);

                return ans;
            }
        }

        public int solution(int[] numbers, int target) {
            // DFS
            return dfs(numbers, target, 0, 0);
        }
    }


}
