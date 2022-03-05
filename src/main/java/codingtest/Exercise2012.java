package main.java.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
  백준 2012번 등수 매기기
 **/
public class Exercise2012 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        long result = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        int rank = n;

        for (int i = arr.length-1; i >= 0; i--) {

            if (arr[i] == rank){
                rank--;
                continue;
            }

            if (arr[i] > rank){
               result += arr[i] - rank;
               rank--;
            }else if (arr[i] < rank){
                result += rank - arr[i];
                rank--;
            }
        }

        System.out.println(result);
    }
}
