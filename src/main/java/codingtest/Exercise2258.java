package main.java.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

/**
 * 백준 2258번 정육점
 */
public class Exercise2258 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int arr[][] = new int[n][2];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]){
                    return o2[0] - o1[0];
                }
                return o1[1] - o2[1];
            }
        });

        int result = 0;
        int kg = 0;

        for (int i = 0; i < arr.length; i++) {
           int price = arr[i][1];

            for (int j = i - 1 ; j >= 0 ; j--){
                if (arr[j][1] == arr[i][1]){
                    price += arr[i][1];
                }else {
                    break;
                }
            }
            kg += arr[i][0];

            if (kg >= m){

                for (int k = i + 1; k < arr.length; k++) {
                    if (arr[i][1] != arr[k][1]){

                        if (price > arr[k][1]){
                            price = arr[k][1];
                            break;
                        }
                    }
                }
                result = price;
                break;
            }

        }

        System.out.println(result != 0 ? result : -1);
    }
}
