package main.java.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 백준 2548번 대표 자연수
 */
public class Exercise2548 {

    static int result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int sum = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int k = arr[i];
            int idx = 0;

            for (int j = 0; j < n; j++) {
                idx += k >= arr[j] ? k - arr[j] : arr[j] - k;
            }

            if (sum > idx){
                sum = idx;
                result = arr[i];
            }
        }

        System.out.println(result);

    }
}
