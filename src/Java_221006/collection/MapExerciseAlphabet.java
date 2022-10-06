package Java_221006.collection;

import java.util.HashMap;
import java.util.Map;

public class MapExerciseAlphabet {
    public static void main(String[] args) {
        IsAlphabet isAlphabet = new IsAlphabet();

        Map<Character, Integer> repoAlphabet = new HashMap<>();

        String repo = "gellrlfoejfwon ".replaceAll(" ", "").toUpperCase();

        for(int j=65; j<=90; j++) {
            repoAlphabet.put((char)j,0);
        }

        for (int i = 0; i < repo.length(); i++) {
            char c = repo.charAt(i);
            if (isAlphabet.isAlphabet(c)) {
                repoAlphabet.put(c, repoAlphabet.get(c) + 1);
            }
        }


        for (Map.Entry<Character, Integer> c : repoAlphabet.entrySet()) {
            System.out.print(c.getKey() + " : " + c.getValue() + " | ");
        }
    }
}
