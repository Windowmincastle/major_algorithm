package A1sort;
import java.util.Collections;
import java.util.PriorityQueue;

// 못 풀엇음

public class 야근지수 {

    public static long solution(int n, int[] works) {

        long answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i : works) {
            pq.add(i);
        }

//        4-1 => 3 add , 3-1 => 2 add
//        큰 값을 지속적으로 빼야한다는 말

        for (int i = 0; i < n; i++) {
            if (pq.isEmpty()) break;

            int temp = pq.poll();
            pq.add(temp - 1);
        }
//      아직 완성 안됐음

        System.out.println(pq);
//        pq문제인지 어떻게 분별할 수 잇나?
//        지속적으로 add하고 빼는 상황이라면 pq 문제를 의심해봐야 한다.



        return answer;
    }

    public static void main(String[] args) {

        int n = 4;
        int[] works = {4, 3, 3};


        //1시간동안 작업량 1 처리 N시간에 N의 일을 처리할 수 있다.
//

//        solution();

//        야근 피로도 = 야근 시작 시점 * 남은 일의 작업량 제곱해서 더한 값

//        1시간에 작업량 1만큼 처리
//        퇴근까지 남은 N시간과 각 일에 대한 작업량 works에 대해 야근 피로도를 최소화한 값을 리턴


    }
}
