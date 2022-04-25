package main.java.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


/**
 * 백준 1448번 삼각형 만들기
 */
public class Exercise1448 {

    static int result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> numArr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            numArr.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(numArr, Comparator.reverseOrder());

        for (int i = 0; i < numArr.size(); i++) {
            Integer num = numArr.get(i);
            int sum = 0;

            for (int j = i + 1; j < i+3 && j < numArr.size(); j++) {
                sum += numArr.get(j);
            }

            if (sum > num) {
                result = sum + num;
                break;
            }
        }

        System.out.println(result != 0 ? result : -1);
    }
}
