import java.util.*;

public class Main {

    // 중복을 피하기 위해 사용된 문자와 그 횟수를 추적하기 위한 함수
    private static void generateAnagrams(char[] word, boolean[] used, StringBuilder current, Set<String> result) {

        if (current.length() == word.length) {
            result.add(current.toString());
            return;
        }

        for (int i = 0; i < word.length; i++) {
            if (used[i]) continue;
            // 중복된 문자를 스킵
            if (i > 0 && word[i] == word[i - 1] && !used[i - 1]) continue;

            used[i] = true;
            current.append(word[i]);
            generateAnagrams(word, used, current, result);
            used[i] = false;
            current.deleteCharAt(current.length() - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> words = new ArrayList<>();

        while (scanner.hasNext()) {
            words.add(scanner.next());
        }
        scanner.close();

        for (String word : words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);  // 문자들을 정렬
            Set<String> result = new TreeSet<>();  // 중복을 제거하고 정렬하기 위한 TreeSet
            boolean[] used = new boolean[chars.length];
            generateAnagrams(chars, used, new StringBuilder(), result);

            for (String anagram : result) {
                System.out.println(anagram);
            }
        }
    }
}
