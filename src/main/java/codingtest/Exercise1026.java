package main.java.codingtest;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 백준 1026번 보물
 **/
public class Exercise1026 {

    public static int result(Integer[] arrA , Integer[] arrB) {
        int result = 0;

        for (int i = 0; i < arrA.length; i++) {
            result += arrA[i] * arrB[i];
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int range = sc.nextInt();
        Integer arrA[] = new Integer[range];
        Integer arrB[] = new Integer[range];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < range; j++) {

                if (i == 0){
                    arrA[j] = sc.nextInt();
                    continue;
                }
                arrB[j] = sc.nextInt();
            }
        }

        Arrays.sort(arrA);
        Arrays.sort(arrB,Collections.reverseOrder());

        System.out.println( result(arrA,arrB));
    }
}
