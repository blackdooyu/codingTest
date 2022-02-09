package main.java.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 백준 11501번 주식
 **/
public class Exercise11501 {

    public static Long result(int arr[]) {
        Long sum = 0L;
        int max = arr.length - 1;

        for (int i = arr.length - 2; i >= 0; i--) {

            if (arr[i] <arr[max]){
                sum += arr[max] - arr[i];
            }else{
                max = i;
            }
        }
     return sum;
    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int test = Integer.parseInt(br.readLine());
        Long[] result = new Long[test];

        for (int i = 0; i < test; i++) {
            int range = Integer.parseInt(br.readLine());

            int arr[] = new int[range];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < range; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
           result[i] = result(arr);
        }

        for (Long i : result) {
            System.out.println(i);
        }

    }
}

