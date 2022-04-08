package main.java.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

/**
 * 백준 7983번 내일 할거야
 */
public class Exercise7983 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int arr[][] = new int[n][2];
        StringTokenizer st;

        for (int i = 0; i < arr.length; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o2[1] == o1[1]){
                    return o2[0] - o1[0];
                }
                return o2[1] - o1[1];
            }
        });

        int result = arr[0][1];

        for (int i = 0; i < arr.length; i++) {

            if (result >= arr[i][1]){
                result = arr[i][1] - arr[i][0];
            }else {
                result -= arr[i][0];
            }

        }

        System.out.println(result);
    }
}
