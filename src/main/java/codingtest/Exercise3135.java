package main.java.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 백준 3135번 라디오
 **/
public class Exercise3135 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        int fix = Integer.parseInt(br.readLine());
        int result = start > end ? start - end : end - start;;

        for (int i = 0; i < fix; i++) {
            int a = Integer.parseInt(br.readLine());
            int h = end > a ? end - a : a - end;

            if (result > h + 1){
                result = h + 1 ;
            }
        }

        System.out.println(result);
    }
}
