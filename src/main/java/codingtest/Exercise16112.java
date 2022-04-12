package main.java.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 백준 16112번 5차 전직
 */
public class Exercise16112 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        long nArr[] = new long[n];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < nArr.length; i++) {
            nArr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(nArr);

        long result = 0;
        for (int i = 1; i < nArr.length; i++) {
            if (k >= i){
                result += nArr[i] * i;
            }else {
                result+= nArr[i] * k;
            }
        }

        System.out.println(result);
    }
}
