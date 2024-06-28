package OffStduy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 숨바꼭질3 {

    static Queue<int[]> q = new LinkedList<>();
    static int[] visited = new int[100001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int target = sc.nextInt();

        int[] visited = new int[100001];
        Arrays.fill(visited, -1);

        Deque<int[]> deque = new ArrayDeque<>();

        deque.add(new int[]{start, 0});
        visited[start] = 0;

        while (!deque.isEmpty()) {

            int[] current = deque.poll();
            int position = current[0];
            int time = current[1];

            if (position == target) {
                System.out.println(time);
                break;
            }

            if (position * 2 <= 100000 && visited[position * 2] == -1) {
                visited[position * 2] = time;
                deque.addFirst(new int[]{position * 2, time});
            }

            if (position + 1 <= 100000 && visited[position + 1] == -1) {
                visited[position + 1] = time +1;
                deque.addLast(new int[]{position + 1, time + 1});
            }

            if (position - 1 >= 0 && visited[position - 1] == -1) {
                visited[position-1] = time-1;
                deque.addLast(new int[]{position - 1, time + 1});
            }

        }

    }
}
