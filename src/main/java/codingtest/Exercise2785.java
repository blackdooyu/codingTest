package main.java.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/**
 * 백준 2785번 체인
 */
public class Exercise2785 {

    static int result;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(list);

        while (list.size() > 1) {

            if (list.get(0) == 0){
                list.remove(0);
                continue;
            }

            list.set(0,list.get(0)-1);
            list.remove(list.size()-1);
            result++;
        }

        System.out.println(result);
    }
}
