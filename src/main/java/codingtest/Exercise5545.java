package main.java.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

/**
 백준 5545번 최고의 피자
 **/
public class Exercise5545 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        long price1 = Integer.parseInt(st.nextToken());
        int price2 = Integer.parseInt(st.nextToken());
        long cal = Integer.parseInt(br.readLine());
        Integer arr[] = new Integer[count];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr, Comparator.reverseOrder());
        long max = cal/price1;

        for (int i = 0; i < arr.length; i++) {
            price1 += price2;
            cal += arr[i];

            if (max < cal/price1) {
                max = cal / price1;
            }
        }

        System.out.println(max);
    }
}
