package A6투포인터;

import java.util.*;

public class T4슬라이딩윈도우 {

    public static void main(String[] args) {

//      연속된 N개의 숫자의 합이 뭐냐?할때 슬라이딩 윈도우가 유리하다. 고정된 배열의 길이를 구할 떄 유리하다.
        int[] nums = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        int k = 4 ;

//      슬라이딩 윈도우로 최대합 구하기
        int left =  0;
        int right = 4;

        List<Integer> list = new ArrayList<>();
        while (right <= nums.length) {
            int temp = 0;
            for (int i = left; i <right; i++) {
                temp += nums[i];
            }

            list.add(temp);
            left++;
            right++;

        }

        int max = Integer.MIN_VALUE;
        for (int i : list) {
            max = Math.max(max, i);
        }

        System.out.println("최대값 -> " + max);
        System.out.println(list);

    }
}
