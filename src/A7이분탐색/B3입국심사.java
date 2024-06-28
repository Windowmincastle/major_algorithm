//package A7이분탐색;
//
//import java.util.Arrays;
//
//public class B3입국심사 {
//
//    public static void main(String[] args) {
//
//        int n = 6;
//        int[] times = {7, 10};
//        Solution solution = new Solution();
//        solution.solution(n, times);
//
//    }
//}
//
//
//
//class Solution {
//    public long solution(int n, int[] times) {
//
//        long answer = 0;
//        int len = times.length-1;
//        Arrays.sort(times);
////      입국심사 인원 / 심사관 수 * Max
////      입국심사 인원 / 심사관 수 * Min
//        int maxTime = (n / times.length) * times[len];
//        int minTime = (n / times.length) *  times[0];
//
//        int setting = minTime;
//        int temp[] = new int[maxTime - minTime];
//        for (int i = 0; i < temp.length; i++) {
//            temp[i] = (minTime+i);
//        }
//
//        int start = 0;
//        int end = temp.length-1;
//        int mid = (temp.length) / 2;
//
//        while (start <= end) {
//
//            if (mid ==){
//
//            } else if () {
//
//            } else if () {
//
//            }
//        }
//
//        return answer;
//    }
//}