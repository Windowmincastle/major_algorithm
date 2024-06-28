package 코딩페스티벌;

import java.io.*;
import java.util.*;

public class 오큰수수현님코드 {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
//        int n = Integer.parseInt(br.readLine());
//        int[] arr = new int[n];
//
//        st = new StringTokenizer(br.readLine());
//        for (int i = 0; i < n; i++) {
//            arr[i] = Integer.parseInt(st.nextToken());
//        }

        int n = 4;
        int[] arr = {3, 5, 2, 7};

        // // 1. 이중for문 : 시간초과
        // // 뒤에서부터 for문을 돌려서 값들 갱신 -> 가장 왼쪽값을 구해야하는거여서 뒤에서부터 돌려서 갱신해줘야함 만약 오른쪽값이라면 앞에서부터 for문 돌려줘야함
        // int[] result = new int[n];
        // for (int i = arr.length - 1; i >= 0; i--) {
        // 	for (int j = i - 1; j >= 0; j--) {
        // 		if (arr[i] > arr[j]) {
        // 			result[j] = arr[i];
        // 		}
        // 	}
        // }
        //
        // // 만약 값이 0이라면 초기화된 값에서 갱신된 적이 없는거니깐 오큰수가 존재하지 않음 : -1로 값 변경
        // for (int i = 0; i < arr.length; i++) {
        // 	if (result[i] == 0) {
        // 		result[i] = -1;
        // 	}
        // 	sb.append(result[i]).append(" ");
        // }

        // 2. stack
        Stack<Integer> stack = new Stack<>(); // 인덱스값을 스택에 넣어서 값들 비교
        for (int i = 0; i < n; i++) {
            // stack안에는 무조건 지금의 i보다 작은 index만 존재하게됨 : 이중for문의 j처럼
            // 이미 갱신된 인덱스의 값이라면 stack에 존재하지 않으니깐
            // i보다 작은 인덱스의 값들 중 arr[i]보다 작은 값이 존재한다면 arr[i]가 오큰수
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                // 갱신되는 값은 pop으로 stack에 존재하지 않게됨
                arr[stack.pop()] = arr[i];
            }
//            0 1 2 3
//            3 5 2 7
            stack.push(i);
        }

        while(!stack.isEmpty()){
            // index값이 스택에 남아있다면 오큰수가 존재하지 않는다는 의미
            arr[stack.pop()] = -1;
        }
        for (int i : arr) {
            sb.append(i).append(" ");
        }
        System.out.println(sb);
    }
}
