package A7이분탐색;

import java.util.Arrays;

public class B3Basic3 {

    public static void main(String[] args) {

//        가까운 값 찾기
        int target = 25;
        int[] arr2 = {10, 20, 30};

//        활용할 수 있다.
        System.out.println(Arrays.binarySearch(arr2, 35));
        System.out.println(Arrays.binarySearch(arr2, 25));

        int idx2 = Arrays.binarySearch(arr2, target);
        if (idx2 < 0) { //이걸 활용해서 이분탐색 문제를 풀수있다.
            System.out.println(Math.abs(idx2)-1); // 타겟보다 큰값 -1
            System.out.println(Math.abs(idx2)-1); // 타겟보다 작은값 -2
        } else {
            System.out.println(idx2);
        }

    }
}
