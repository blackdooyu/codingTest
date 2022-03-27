package main.java.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * 백준 2262번 토너먼트
 */
public class Exercise2262 {

    public static int result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> numList = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            numList.add(Integer.parseInt(st.nextToken()));
        }

        while (numList.size() != 1) {
            int max = 0;
            int index = 0;

            for (int i = 0; i < numList.size(); i++) {
                Integer n = numList.get(i);

                if (n > max) {
                    max = n;
                    index = i;
                }
            }

            if (index != 0 && index != numList.size()-1) {
                Integer n1 = numList.get(index);
                Integer n2 = numList.get(index - 1);
                Integer n3 = numList.get(index + 1);

                int subtract = n2 > n3 ? n2 : n3;

                result += n1 - subtract;
                numList.remove(index);

            } else if (index == 0) {
                Integer n1 = numList.get(index);
                Integer n2 = numList.get(index + 1);

                result += n1 - n2;
                numList.remove(index);
            } else {
                Integer n1 = numList.get(index);
                Integer n2 = numList.get(index - 1);

                result += n1 - n2;
                numList.remove(index);

            }
        }

        System.out.println(result);
    }
}
