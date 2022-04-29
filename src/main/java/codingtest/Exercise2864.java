package main.java.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 백준 2864번
 */
public class Exercise2864 {

    static StringTokenizer st;
    static int min;
    static int max;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        String n = st.nextToken();
        String k = st.nextToken();

        char[] nArr = n.toCharArray();
        char[] kArr = k.toCharArray();

        for (int i = 0; i < 2; i++) {
            if (i == 0){
                for (int j = 0; j < nArr.length; j++) {
                    if (nArr[j] == '6'){
                        nArr[j] ='5';
                    }
                    if (kArr[j] == '6'){
                        kArr[j] = '5';
                    }
                }
              min = Integer.parseInt(String.valueOf(nArr)) + Integer.parseInt(String.valueOf(kArr));
            }

            if (i == 1){
                for (int j = 0; j < nArr.length; j++) {
                    if (nArr[j] == '5'){
                        nArr[j] ='6';
                    }
                    if (kArr[j] == '5'){
                        kArr[j] = '6';
                    }
                }
                max = Integer.parseInt(String.valueOf(nArr)) + Integer.parseInt(String.valueOf(kArr));
            }
        }

        System.out.println(min+" "+max);
    }
}
