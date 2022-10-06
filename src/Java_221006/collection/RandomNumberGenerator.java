package Java_221006.collection;

import java.util.HashSet;
import java.util.Set;

public class RandomNumberGenerator implements NumberGenerator{
    Set<Integer> dup = new HashSet<>();
    Set<Character> dupAlphabet = new HashSet<>();
    @Override
    public int generate(int num) {
        return (int)(Math.random()*num);
    }
    @Override
    public void generateDuplicated(int num) {
        dup.add(generate(num));
        System.out.println("성공");
    }

    @Override
    public void generateAlphabet() {
        dupAlphabet.add((char) ((Math.random() * 26) + 65));
        System.out.println("성공");
    }

    public Set<Integer> getGenerateDuplicated() {
        return this.dup;
    }

    public Set<Character> getDupAlphabet() {
        return this.dupAlphabet;
    }
}
