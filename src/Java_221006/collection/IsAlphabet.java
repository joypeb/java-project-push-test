package Java_221006.collection;

public class IsAlphabet {
    public boolean isAlphabet(char chr) {
        if((65 <= chr && chr <= 90) || (97 <= chr && chr <= 122)) {
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        IsAlphabet isAlphabet = new IsAlphabet();
        char chr = 'd';
        char chr2 = '0';

        System.out.println(isAlphabet.isAlphabet(chr));
        System.out.println(isAlphabet.isAlphabet(chr2));
    }
}
