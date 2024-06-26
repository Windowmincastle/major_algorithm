//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//
//// tickets = [["ICN", "D"], ["D", "ICN"], ["ICN", "B"]]
//// answer = ['ICN', 'D', 'ICN', 'B']
//
//public class 여행경로 {
//    static String[][] tickets = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL", "SFO"}};
//    static boolean[] visited;
//    static ArrayList<String> resultList;
//    static String[] answer;
//
//    public static void main(String[] args) {
//        visited = new boolean[tickets.length];
//        int idx = 0;
//        resultList = new ArrayList<>();
//
//        Arrays.sort(tickets, new Comparator<String[]>() {
//            @Override
//            public int compare(String[] o1, String[] o2) {
//                return o1[1].compareTo(o2[1]);
//            }
//        });
//// 0시작
//        dfs(tickets,"ICN", "ICN ", idx);
//        // Collections.sort(resultList);
//        answer = resultList.get(0).split(" ");
//
//        System.out.println(resultList);
//        System.out.println(Arrays.toString(answer));
//    }
//
//    static void dfs(String[][] tickets, String start, String result, int idx) {
//
//        if (idx == tickets.length) {
//            resultList.add(result);
//            return;
//        }
//
//        for (int i = 0; i < tickets.length; i++) {
//            if (start.equals(tickets[i][0]) && !visited[i])  {
//                visited[i] = true; // 방문 처리
//                result +=  (tickets[i][1]+" ");
//                dfs(tickets, tickets[i][1], result, idx + 1);
//                result = result.substring(0, result.length()-4);
//                visited[i] = false;
//            }
//        }
//
//    }
//}