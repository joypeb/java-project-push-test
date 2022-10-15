package test;

import java.util.Scanner;
//import java.util.*;

public class ClassTimeMeasurement {
    public static void main(String[] args) {
        //메모리 측정
        Runtime runtime = Runtime.getRuntime();
        long memory = runtime.totalMemory() - runtime.freeMemory();
        //시간 측정
        long start = System.nanoTime();
        Scanner sc = new Scanner(System.in);

        //메모리 측정

        int num = 0;

        for(int i=0; i<1000000; i++ ){
            num += i;
        }

        long finish = System.nanoTime();
        long time = finish - start;

        System.out.println("최종시간 : " + time);
        System.out.println("메모리 : " + memory);
    }
}
