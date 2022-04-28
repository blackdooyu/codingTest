package main.java.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 백준 20117번
 */
public class Exercise20117 {

    static StringTokenizer st;
    static int result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int idx = arr.length-1;
        for (int i = 0; i < arr.length/2; i++) {
            result += arr[idx] * 2;
            idx--;
        }

        if (arr.length % 2 != 0 && arr.length > 2){
            result += arr[arr.length/2];
        }

        System.out.println(result);
    }
}
