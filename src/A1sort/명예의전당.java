/*
못 풀엇음 6-21 강의녹화 마지막 부분 참고하길 바람
 */
package A1sort;
import java.util.*;
public class 명예의전당 {

    static public int[] solution(int k, int[] score) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        Queue<Integer> pq = new PriorityQueue<>();
//
//        for (int i = 0; i<= k; i++) {
//            pq.add(score[i]);
//            temp.add(score[i]);
//            Collections.sort(temp);
//            list.add(pq.peek());
//        }
//
//        for (int i = k; i <= score.length-1; i++) {
//
//            pq.add(score[i]);
//            list.add(pq.poll());
//        }

        for (int i = 0; i <= score.length - 1; i++) {

            if (pq.size() < k) {
                pq.add(score[i]);
            } else {
                pq.poll();
                pq.add(score[i]);
            }

            list.add(pq.peek());

        }

        System.out.println(list);
        return answer;
    }


    public static void main(String[] args) {

        int k = 3;
        int[] score = {10, 100, 20, 150, 1, 100, 200};
//
//        int k = 4;
//        int[] score = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000 };

        solution(k, score);
//        System.out.println(Arrays.toString(solution(k, score)));

    }
}
