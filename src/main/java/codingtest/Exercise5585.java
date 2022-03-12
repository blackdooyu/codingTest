package main.java.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 백준 5585번 거스름돈
 */
public class Exercise5585 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int subtract = Integer.parseInt(br.readLine());
        int n = 1000 - subtract;
        int count = 0;

        while (n != 0){

            if (n >= 500) {
              n -= 500;
            } else if (n >= 100) {
                n -= 100;
            }else if (n >= 50) {
                n -= 50;
            }else if (n >= 10) {
                n -= 10;
            }else if (n >= 5) {
                n -= 5;
            }else if (n >= 1) {
                n -= 1;
            }

            count++;
        }

        System.out.println(count);
    }

}
