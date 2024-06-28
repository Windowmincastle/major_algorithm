package 코딩페스티벌;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 오큰수 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();
        List<Integer> answer = new ArrayList<>();


        int[] ary = new int[n];
        for (int i = 0; i < n; i++) {
            ary[i] =Integer.parseInt(st.nextToken());
        }

        for (int i : ary) {
            stack.add(i);
        }

        for (int i = 0; i < n; i++) {
            int popValue = stack.pop();
            if ( popValue > ary[i] ) {
                list.add(popValue);
                stack.add(popValue);
            }

            Collections.sort(list);
            answer.add(list.get(0));
        }

        System.out.println(stack);


        System.out.println(answer);
    }

}
