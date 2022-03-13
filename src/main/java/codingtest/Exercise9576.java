package main.java.codingtest;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

/**
 * 백준 9576번 책 나눠주기
 */
public class Exercise9576 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 0; i < testCase ; i++) {
            st = new StringTokenizer(br.readLine());
            int book = Integer.parseInt(st.nextToken());
            int peoples = Integer.parseInt(st.nextToken());
            int count = 0;

            int arr[][] = new int[peoples][2];
            boolean books[] = new boolean[book+1];
            books[0] = true;

            for (int j = 0; j < peoples; j++) {
                st = new StringTokenizer(br.readLine());
                arr[j][0] = Integer.parseInt(st.nextToken());
                arr[j][1] = Integer.parseInt(st.nextToken());

            }

            Arrays.sort(arr, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    if (o1[0] == o2[0]){
                       return o2[1] - o1[1];
                    }
                    return o2[0] - o1[0];
                }
            });

            for (int k = 0 ; k < peoples ; k++){

                for (int p = arr[k][1] ; p >= arr[k][0] ; p--){
                    if (!books[p]){
                        books[p] = true;
                        count++;
                        break;
                    }
                }
            }
            bw.append(count+"\n");
        }

        bw.flush();
        bw.close();
    }
}
