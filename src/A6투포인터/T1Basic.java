package A6투포인터;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T1Basic {

    public static void main(String[] args) {

        int[] nums = {7, 8, 9, 2, 4, 5, 1, 3, 6};
        int target = 10;

        // (1) nums 배열에서 target이 될 수 있는 두 수의 조합 찾기
        Arrays.sort(nums); // [1, 2, 3, 4, 5, 6, 7, 8, 9]
        System.out.println(Arrays.toString(nums));

        // for문
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    list.add(new int[] {nums[i], nums[j]}); // 배열 형태로 인덱스 넣기
                }
            }
        }

        System.out.println("for문");

        for (int[] l : list) {
            System.out.println(Arrays.toString(l));
        }

        // 투포인터
        List<int[]> list2 = new ArrayList<>();
        int start = 0; int end = nums.length - 1;

        while (start < end) {

//            타겟보다 크다면 end를 줄여야 start+end의 합이 작아지기 때문에 end의 포인터를 이동해야한다.
            if (nums[start] + nums[end] > target) {
                end--;
//            타겟보다 작다면
            } else if (nums[start] + nums[end] < target) {
                start++;
            } else { // target == sum이라면 해당 숫자 조합을 list에 1차원 배열 형태로 추가한다.
                list2.add(new int[]{ nums[start], nums[end]});
                start++; end--; // 중복 숫자가 없으면 둘다 이동 (아니면 하나만 이동)
            }

        }
        System.out.println("while문 - 투포인터 ");
        for (int[] l : list2) {
            System.out.println(Arrays.toString(l));
        }


        System.out.println("구간의 합 시작");
        List<int[]> list3 = new ArrayList<>();
        // [7, 8, 9, 2, 4, 5, 1, 3, 6]]
        int left = 0; int right = 0;
        int sum = nums[0];

        while (left <= right) {
            if (sum == target) {
                list3.add(new int[]{left, right});
                sum -= nums[left];
                left++;
            } else if (sum < target && right < nums.length - 1) {
                System.out.println(" sum < target if문 현재 sum의 값 ->"+sum);
                right++;
                sum += nums[right];
            } else {
                System.out.println("else문 sum의 값 ->"+sum);
                sum -= nums[left];
                left++;
            }
        }
        for (int[] l : list3) {
            System.out.println(Arrays.toString(l));
        }
    }
}
