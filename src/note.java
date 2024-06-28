//import java.util.*;
//
//public class HideAndSeek3 {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int start = sc.nextInt();  // 시작 위치
//        int target = sc.nextInt(); // 목표 위치
//
//        // 방문 체크 배열, 최댓값은 100000 (문제 조건)
//        int[] visited = new int[100001];
//        Arrays.fill(visited, -1); // 방문하지 않은 곳을 -1로 초기화
//
//        // BFS 수행을 위한 덱(Deque) 초기화
//        Deque<int[]> deque = new ArrayDeque<>();
//        // 시작 위치와 시간 0을 덱에 추가
//        deque.add(new int[]{start, 0});
//        // 시작 위치를 방문 표시 (시간 0)
//        visited[start] = 0;
//
//        // BFS 루프
//        while (!deque.isEmpty()) {
//            // 현재 위치와 경과 시간을 덱에서 꺼냄
//            int[] current = deque.poll();
//            int position = current[0];
//            int time = current[1];
//
//            // 목표 위치에 도달하면 경과 시간 출력 후 종료
//            if (position == target) {
//                System.out.println(time);
//                break;
//            }
//
//            // *2 이동 (가중치 0)
//            if (position * 2 <= 100000 && visited[position * 2] == -1) {
//                visited[position * 2] = time; // 방문 시간 갱신
//                deque.addFirst(new int[]{position * 2, time}); // 덱의 앞에 추가 (우선 처리)
//            }
//
//            // +1 이동 (가중치 1)
//            if (position + 1 <= 100000 && visited[position + 1] == -1) {
//                visited[position + 1] = time + 1; // 방문 시간 갱신
//                deque.addLast(new int[]{position + 1, time + 1}); // 덱의 뒤에 추가
//            }
//
//            // -1 이동 (가중치 1)
//            if (position - 1 >= 0 && visited[position - 1] == -1) {
//                visited[position - 1] = time + 1; // 방문 시간 갱신
//                deque.addLast(new int[]{position - 1, time + 1}); // 덱의 뒤에 추가
//            }
//        }
//    }
//}
