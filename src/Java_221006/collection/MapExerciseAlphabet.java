package Java_221006.collection;

import java.util.HashMap;
import java.util.Map;

public class MapExerciseAlphabet {
    public static void main(String[] args) {
        Map<Character,Integer> repoAlphabet = new HashMap<>();

        String repo = "gellrlfoejfwon ".replaceAll(" ", "");
        boolean repoTF = true;

        for(int i=0; i<repo.length(); i++) {
            if((65 <= repo.charAt(i) && repo.charAt(i) <= 90) || (97 <= repo.charAt(i) && repo.charAt(i) <= 122)) {
                repoTF = true;
                repoAlphabet.put(repo.charAt(i),i);
            }else {
                repoTF = false;
                break;
            }
        }

        if(repoTF) {
            for(Map.Entry<Character,Integer> c : repoAlphabet.entrySet()) {
                System.out.print(c.getKey() + " ");
            }
            System.out.println("알파벳의 개수 : " + repoAlphabet.size());
        }else{
            System.out.println("영어가 아닙니다");
        }
    }
}
