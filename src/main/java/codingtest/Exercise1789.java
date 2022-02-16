package main.java.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 백준 1789번 수들의 합
 **/
public class Exercise1789 {

    public static long result(long num) {
        long sum = 0 ;
        int index = 0;

        for (int i = 1; ; i++) {
            sum += i;

            if (sum >= num){
                index = i;
                break;
            }
        }
        return sum == num ? index : index - 1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long num = Long.parseLong(br.readLine());

        System.out.println(result(num));
    }
}
