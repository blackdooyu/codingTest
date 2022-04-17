package main.java.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 백준 11509번 풍선 맞추기
 */
public class Exercise11509 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int comp, arrow = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] list = new int[1000002];
        for (int i = 0; i < n; i++) {
            comp = Integer.parseInt(st.nextToken());
            if (list[comp + 1] > 0) {
                list[comp]++;
                list[comp + 1]--;
            } else {
                list[comp]++;
                arrow++;
            }
        }

        System.out.println(arrow);
    }
}
