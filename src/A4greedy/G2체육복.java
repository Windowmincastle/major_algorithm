package A4greedy;
import java.util.*;
public class G2체육복 {
    public static void main(String[] args) {

    }
}

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {

        int answer = 0;

        Set<Integer> resSet = new HashSet<>();
        Set<Integer> losSet = new HashSet<>();

        Arrays.sort(reserve);
        for (int i : lost) {
            losSet.add(i);
        }

        for (int i = 0; i < reserve.length; i++) {
            if (losSet.contains(reserve[i])) {
                losSet.remove(reserve[i]);
                reserve[i] = -1;
            }
        }

        for (int i = 0; i < reserve.length; i++) {
            if (reserve[i] == -1) continue;

            if (losSet.contains(reserve[i] - 1)) {
                losSet.remove(reserve[i] - 1);
            } else if (losSet.contains(reserve[i]+1)) {
                losSet.remove(reserve[i] + 1);
            }
        }

        answer = n-losSet.size();
        return answer;
    }
}
