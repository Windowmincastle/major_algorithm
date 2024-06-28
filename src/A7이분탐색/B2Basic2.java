package A7이분탐색;

import java.util.Arrays;

public class B2Basic2 {

    public static void main(String[] args) {
//      target을 찾되, target이 없으면 target보다 큰 값 중에 첫번째 값을 찾아라.
        int[] arr = {1, 3, 5, 7, 8, 9};
        int target = 5;
        int start = 0;
        int end = arr.length - 1;
        int idx = -1;
        while (start <= end) {

            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                System.out.println("진입");
                idx = mid;
                System.out.println("찾고자 하는 값은 arr 배열의 " + idx + "번째 에 있습니다.");
                break;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }
        }

        int target2 = 0;
        if (idx == -1) {
            while (true) {
                System.out.println("여기에 진입하면 출력");
                target++;
                target2 = Arrays.binarySearch(arr, target);
                if (target2 > 0) {
                    System.out.println("target이 없고 target보다 큰 첫번째 값은 " + arr[target2] + "이고 인덱스는 " + (target2 + 1) + " 입니다.");
                    break;
                }
            }

        }
    }
}
//}

//class lecture {
//
//    public static void main(String[] args) {
//
//    }
//
//
