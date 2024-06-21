//package A1sort;
//
//import java.util.*;
//
//public class S1Heapsort구현혼자서 {
//
//    static List<Integer> answer = new ArrayList<>();
//
//    static void dfs(List<Integer> list,int start, int left, int right) {
//
//        if ()
////        먼저 원소를 교체하자
//        int temp = list.get(list.size());
//        list.set(0, temp);
//        list.remove(list.size());
//
//        for (Integer i : list) {
//            answer.add(i);
//        }
//
//        if (list.get(left) > list.get(start) || list.get(right) > list.get(start)) {
//            dfs(list,start+1,left*2+1,right*2+1);
//        } else {
//            ret   urn answer;
//        }
//
//    }
//
//    public static void main(String[] args) {
//
////        더이상 체인지가 일어나지 않으면 or 체인지가 발생이 안되면 종료하면 될거같다.
////    1x2+1 , 1x2+2
////      dfs(start * 2 + 1, or start * 2 +2 );
//        int[] arr = {7, 6, 5, 8, 3, 5, 9, 1, 6};
//
//        int start = 0;
//        int left = start * 2 + 1;
//        int right = start * 2 + 2;
//
//        List<Integer> list = new ArrayList<>();
//        for (int i : arr) {
//            list.add(i);
//        }
//        Collections.sort(list);
//        System.out.println(list);
//
//        dfs(list, 0, left, right);
//
//    }
//
//}
