package main.java.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
  백준 1105번 팔
 **/
public class Exercise1105 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String l = st.nextToken();
        String r = st.nextToken();
        int result = 0;

        for (int i = 0; i < r.length(); i++) {

            if (l.length() != r.length()){
                break;
            }

            if (l.charAt(i) == '8' &&  r.charAt(i) == '8'){
                    result++;
            }else if (l.charAt(i) == r.charAt(i)){
                continue;
            }else {
                break;
            }
        }
        System.out.println(result);
    }
}
