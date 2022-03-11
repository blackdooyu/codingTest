package main.java.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 백준 2847번 게임을 만든 동준이
 */
public class Exercise2874 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int arr[] = new int[count];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int result = 0;

        while (true){
            boolean check = false;

            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i] >= arr[i+1]){
                    int sum = (arr[i] - arr[i + 1]) + 1;
                    arr[i] = arr[i] - sum;
                    result += sum;
                    check = true;
                }
            }

            if (!check){
                break;
            }
        }

        System.out.println(result);
    }
}
