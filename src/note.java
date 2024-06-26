import java.util.Arrays;

public class note {

    public static void main(String[] args) {
    }
}

class Solution3 {

    public int solution(int[] people, int limit) {

        Arrays.sort(people);

        int answer = 0;
        int left = 0;
        int right = people.length-1;

        while (left <= right) {

            if (people[left] + people[right] <= limit) {

                left++;
                right--;

            } else {

                right--;
            }

            answer++;
        }

        return answer;
    }
}