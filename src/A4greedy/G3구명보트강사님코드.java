package A4greedy;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class G3구명보트강사님코드 {
    public static int main(int[] people,int limit) {

        Arrays.sort(people);
        Deque<Integer> deque = new ArrayDeque<>();

        for (int p : people) {
            deque.add(p);
        }

        int answer = 0;

        while (!deque.isEmpty()) {

            int last = deque.pollLast();
            answer++;
            if (last + deque.peekFirst() <= limit) {
                deque.pollFirst();
            }

        }

        return answer;
    }
}
