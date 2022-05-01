package main.java.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 백준 1758번 알바생 강호
 */
public class Exercise1758 {

    static long result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list, Collections.reverseOrder());

        for (int i = 0; i < list.size(); i++) {
            int value = list.get(i);
            int sum = value-i;

            if (sum > 0){
                result += sum;
            }
        }

        System.out.println(result);
    }
}
