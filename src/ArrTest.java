public class ArrTest {
    public static void main(String[] args) {
        System.out.println("hello");
        //10칸의 int array
        //1부터 10까지 채우고 콘솔에 출력
        int[] arr = new int[10];

        for(int i=0; i<10; i++) {
            arr[i] = i+1;
            System.out.print(arr[i] + " ");
        }
    }
}
