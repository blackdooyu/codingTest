package main.java.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 백준 15903번 카드 합체 놀이
 **/
public class Exercise15903 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int card = Integer.parseInt(st.nextToken());
        int count = Integer.parseInt(st.nextToken());
        Long arr[] = new Long[card];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }

        for (int i = 0; i < count; i++) {
            Arrays.sort(arr);
            long sum = arr[0] + arr[1];
            arr[0] = sum;
            arr[1] = sum;
        }

        long result = 0;

        for (Long i : arr) {
            result += i;
        }

        System.out.println(result);
    }
}
