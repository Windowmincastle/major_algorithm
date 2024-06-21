package A1sort;

import java.util.Arrays;

public class Heap강사님 {


    public static void main(String[] args) {

        int [] arr = {7,6,5,8,3,5,9,1,7};

//      아래 for문이 최초 힙이진트리 구성함
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            heapify(arr,arr.length-1,i); //여기서 i 가 노드의 역할을 한다.
        }

//        루트노드와 최하위 노드를 change 하면서 heapify
        for (int i=arr.length-1; i>=0; i--){
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            heapify(arr,i-1,0);
        }

        System.out.println(Arrays.toString(arr));
    }

    static void heapify(int[] ary, int aryLen, int node) {
//        왼쪽노드 : node*2 + 1
//        오른쪽 노드 : ndoe *2 +2

//      첫번째 check : 왼,오 노드가 배열의 길이보다 짧아야함
//      두번째 check : node를 제외한 left , right 세개 중 가장 작은 노드로 다시 heapify
        int left = node * 2 +1 ;
        int right = node * 2 +2;

        if (left > aryLen) return;
//37, 39라인에 =을 추가하면 내림차순으로 정렬이 되기는하나 논리적인 이유는 모르겠다.
        if (right > aryLen) {
//          node랑 left만 비교
            if (ary[node] > ary[left]) {
                int temp = ary[node];
                ary[node] = ary[left];
                ary[left] = temp;
                heapify(ary,aryLen, left);
            }
        } else {
//            node,left,right 모두 비교
            int idx = 0;
            if (ary[node] > ary[left] || ary[node] > ary[right]) {
                if (ary[left] > ary[right]) {
                    idx = right;
                } else {
                    idx = left;
                }

                int temp = ary[node];
                ary[node] = ary[idx];
                ary[idx] = temp;
                heapify(ary, aryLen, idx);

            }
        }
    }
}
