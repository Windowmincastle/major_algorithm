package A7이분탐색;

import java.util.Arrays;

public class B1Basic1 {

    public static void main(String[] args) {
//      이분 탐색은 사전에 정렬이 되어 있어야 가능한 알고리즘 이다.
        int[] ary = {1,3,5,7,9,11,13,15,17};
//        복잡도 : 성능이 좋은 것은, 대부분 절반 씩 잘라서 자료를 분석한다.

        int start = 0;
        int end = ary.length-1;
        int target = 17;
        int answer = 0;


//        정렬이 전제가 되어 있어야 한다.
        Arrays.sort(ary);
        while (start <= end) {
//            시작할 때 여기서 mid 설정 해주는게 좋은 것 같다.
            int mid = (start+end) / 2;

            if ( ary[mid] == target ) {
                answer = mid;
                System.out.println("찾고자하는 값 "+target+"은 배열 ary의 "+answer+"번째 위치에 있습니다.");
                break;
            } else if (target > ary[mid] ) {
                start = mid+1;
            } else if (target < ary[mid]) {
                end = mid-1;
            }
        }
        System.out.println(answer);
    }
}
