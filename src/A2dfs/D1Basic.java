//package A2dfs;
//
//import java.util.ArrayList;
//import java.util.Formattable;
//import java.util.List;
//
//public class D1Basic {
//
//    //        1. 인접 배열
//    static int[][] arr =
//            {
//                    {0, 1},
//                    {0, 2},
//                    {1, 3},
//                    {2, 3},
//                    {2, 4}
//            };
//    static List<List<Integer>> adj;
//    static boolean[] visited = new boolean[arr.length];
//    static int len = arr.length;
//    static List<Integer> answer = new ArrayList<>();
//    public static void main(String[] args) {
//
////        방문할 수 있는 정점이 여러 개 인 경우 정점 번호가 작은것을 먼저 방문하는
////        dfs알고리즘 형식의 방문 순서를 출력하라
////        0,1,3,2,4 출력. 이걸 어떻게 할 것 인가
////        노드 관계를 어떻게 표현할 수 있냐?
////        인접리스트 초기화
//        for (int i = 0; i < 5; i++) {
//            adj.add(new ArrayList<>()); // 빈 리스트 삽입
//        }
//
//        for (int[] a : arr) {
//            adj.get(a[0]).add(a[1]);
//            //아래는 양방향일 경우
////            adj.get(a[1]).add(a[0]);
//        }
////        노드 번호 자체를 배열에 담아서 표현한다.
//
////        0번 노드부터 시작
//        dfs(len,0);
////       방문 여부를 처리 해야한다.
//    }
//
//    static int dfs(int node) {
//
//        if (node == len) {
//            return 0;
//        }
//
//        int next = adj.get(node).get(1);
//        answer.add(adj.get(node).get(1));
//        dfs(next);
//
//        return answer;
//    }
//}
