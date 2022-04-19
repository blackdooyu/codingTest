package main.java.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/**
 * 백준 2450번 모양 정돈 (틀림)
 */
public class Exercise2450 {

    static int result;
    static List<Integer> list = new ArrayList<>();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        for (int i = 1; i < 3; i++) {
            boolean check = false;
            boolean check1 = false;
            List<Integer> indexList = new ArrayList<>();
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j) == i){
                    indexList.add(j);
                    if (!check){
                        check = true;
                    } else if (!check1){
                        check1 = true;
                        result++;
                    }
                }else {
                    check1 =false;
                }
            }
            Collections.sort(indexList,Collections.reverseOrder());
            for (int k = 0; k < indexList.size(); k++) {
                list.remove(indexList.get(k));
            }
        }

        System.out.println(result);
    }

}
