package main.java.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 백준 4769번 캠핑
 */
public class Exercise4796 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 1;


        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            if (l == 0 && p == 0 && v ==0){
                break;
            }

            int result = (v/p) * l;
            int i = v % p;
            if (i > l){
                result += l;
            }else {
                result += i;
            }

            System.out.println("Case "+count+": "+result);
            count++;
        }
    }
}
