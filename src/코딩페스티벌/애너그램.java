package 코딩페스티벌;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 애너그램 {

    StringBuilder sb = new StringBuilder();
    static List<String> answer = new ArrayList<>();
    static boolean[] visited;
    static char[] words;
    static String result = "";
    static Set<String> set = new TreeSet<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String word;
        for (int i = 0; i < n; i++) {
            word = br.readLine();
            words = word.toCharArray();
        }

        for (int i = 0; i < words.length; i++) {
            String temp = "";
            for (int j = 0; j < words.length; j++) {
                temp += words[j];
            }
            set.add(temp);
            answer.add(temp);

        }

        for (String s : set) {
            System.out.println(s);

        }

        System.out.println(answer);

    }
}

//    static void dfs(int start, char[] words, String result) {
//
//        for (int i = 0; i < words.length; i++) {
//            String temp = "";
//            for (int j = 0; j < words.length; j++) {
//                temp += words[j];
//            }
//            set.add(temp);
//        }
//
//    }
//
//}
