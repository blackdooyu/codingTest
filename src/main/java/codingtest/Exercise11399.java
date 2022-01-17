package main.java.codingtest;

import java.util.Arrays;
import java.util.Scanner;

/**
  백준 11399번 문제 ATM
 **/
public class Exercise11399 {

    public static int result(int arr[]) {
        int time = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            time += arr[i];
            sum += time;
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int arr[] = new int[count];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.println(Exercise11399.result(arr));

    }
}
