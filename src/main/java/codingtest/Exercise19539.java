package main.java.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
  백준 19539번 사과나무
 **/
public class Exercise19539 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = 0;
        int num = 0;

        for (int i = 0; i < count; i++) {
            int j = Integer.parseInt(st.nextToken());
            sum += j;
            if (j % 2 == 1){
                num++;
            }
        }

        if (sum % 3 == 0 && num <= sum/3){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
