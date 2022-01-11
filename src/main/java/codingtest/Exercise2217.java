package main.java.codingtest;

import java.util.Arrays;
import java.util.Scanner;

/**
 백준 2217번 로프
 **/
public class Exercise2217 {

    public static int result(int[] arr) {
        Arrays.sort(arr);
        int max = arr[0] * arr.length;

        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i] * (arr.length-i)){
                max = arr[i] * (arr.length-i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int arr[] = new int[count];

        for (int i = 0 ; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int result = Exercise2217.result(arr);
        System.out.println(result);
    }
}
