//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Comparator;
//
//public class 여행경로 {
//
//    static String[][] tickets = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL", "SFO"}};
//    static boolean[] visited;
//    static ArrayList<String> resultList;
//    static String[] answer;
//
//    public static void main(String[] args) {
//        // visited 배열을 항공권 개수만큼 초기화
//        visited = new boolean[tickets.length];
//        resultList = new ArrayList<>();
//
//        // 항공권 배열을 도착지 기준으로 사전순 정렬
//        Arrays.sort(tickets, new Comparator<String[]>() {
//            @Override
//            public int compare(String[] o1, String[] o2) {
//                return o1[1].compareTo(o2[1]);
//            }
//        });
//
//        // "ICN" 공항에서 시작하여 DFS 탐색 시작, 초기 경로는 "ICN "
//        dfs(tickets,"ICN", "ICN ", 0);
//
//        // resultList에 가능한 모든 경로 저장, 사전순으로 앞서는 경로
//        answer = resultList.get(0).split(" ");
//
//        // 출력
//        System.out.println(Arrays.toString(answer));
//    }
//
//    static void dfs(String[][] tickets, String start, String result, int idx) {
//        // 모든 항공권을 사용한 경우 탈출
//        if (idx == tickets.length) {
//            resultList.add(result); // 현재 경로를 resultList에 추가
//            return;
//        }
//
//
//        for (int i = 0; i < tickets.length; i++) {
//
//            // 현재 항공권의 출발지가 start와 같고, 아직 사용되지 않은 경우
//            if (start.equals(tickets[i][0]) && !visited[i])  {
//                visited[i] = true;
//
//                // 현재 경로에 도착지를 추가
//                result +=  (tickets[i][1] + " ");
//                // 재귀 호출로 DFS 탐색을 계속 진행, 도착지를 새로운 출발지로 사용
//                dfs(tickets, tickets[i][1], result, idx + 1);
//                // 경로에서 마지막 도착지를 제거 (백트래킹)
//                result = result.substring(0, result.length() - 4);
//                // 해당 항공권을 사용하지 않은 것으로 표시 (백트래킹)
//                visited[i] = false;
//            }
//        }
//    }
//}
