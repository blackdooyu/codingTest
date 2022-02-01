package main.java.codingtest;

import java.util.Scanner;

/**
  백준 2748번 피보나치 수 2
 **/
public class Exercise2748 {

    public static Long result(int n) {

       Long arr[] = new Long[n+1];
       arr[0] = 0L;
       arr[1] = 1L;

        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[n];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(result(n));

    }
}
