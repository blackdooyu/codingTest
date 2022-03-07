package main.java.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/**
 * 백준 14241번 슬라임 합치기
 */
public class Exercise14241 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> slimeList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            slimeList.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(slimeList);
        int result;
        int sum;

        if (slimeList.get(0) == 1) {
            int size = slimeList.size();
             result = slimeList.get(0) * slimeList.get(size-1);
             sum = slimeList.get(0) + slimeList.get(size-1);
             slimeList.remove(size-1);
             slimeList.remove(0);
        }else {
            result = slimeList.get(0) * slimeList.get(1);
            sum = slimeList.get(0) + slimeList.get(1);
            slimeList.remove(0);
            slimeList.remove(0);
        }


        while (!slimeList.isEmpty()) {
            Integer y = slimeList.get(0);

            result += sum*y;
            sum += y;

            slimeList.remove(0);
        }

        System.out.println(result);

    }
}
