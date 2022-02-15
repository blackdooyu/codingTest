package main.java.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 백준 7568번 덩치
 **/
public class Exercise7568 {

    public static void result(int arr[][]) {

        for (int i = 0; i < arr.length; i++) {
            int ranking = 1;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]){
                    ranking++;
                }
            }
            System.out.println(ranking);
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        int arr[][] = new int[testCase][2];

        for (int i = 0; i < testCase; i++) {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);

            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());

        }

        result(arr);
    }
}
