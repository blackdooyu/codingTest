package main.java.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 백준 16678번 모독
 */
public class Exercise16678 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        long result = 0;

        if (arr[0] != 1){
            result += arr[0] - 1;
            arr[0] = 1;
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i-1]){
                result += arr[i] - (arr[i-1] +1);
                arr[i] = arr[i - 1] + 1;
            }
        }
        System.out.println(result);

    }
}
