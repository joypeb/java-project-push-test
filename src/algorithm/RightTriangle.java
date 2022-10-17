package algorithm;

public class RightTriangle {
    public void rightTriangle(int num) {
        for(int i=0; i<num; i++) {
            for(int j=0; j<i+1; j++) {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }

    public static void main(String[] args) {
        RightTriangle rightTriangle = new RightTriangle();

        rightTriangle.rightTriangle(4);
    }
}
