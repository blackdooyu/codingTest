package main.java.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

/**
 백준 1946번 신입 사원
 **/
public class Exercise1946 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        int result[] = new int[testCase];

        for (int i = 0; i < testCase; i++) {
            int range = Integer.parseInt(br.readLine());
            int arr[][] =new int[range][2];

            for (int j = 0; j < arr.length; j++) {
                String str = br.readLine();
                StringTokenizer st1 = new StringTokenizer(str);
                arr[j][0] = Integer.parseInt(st1.nextToken());
                arr[j][1] = Integer.parseInt(st1.nextToken());
            }
            Arrays.sort(arr, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    return o1[0] - o2[0];
                }
            });

            result[i] = result(arr);
        }

        for (int i : result) {
            System.out.println(i);
        }
    }

    public static int result(int[][] arr) {
        int count = 1;
        int min = arr[0][1];

        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i][1]){
                min = arr[i][1];
                count++;
            }
        }
        return count;
    }
}
