package main.java.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 19941번 햄버거 분배
 */
public class Exercise19941 {

    static StringTokenizer st;
    static int result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        String input = br.readLine();
        char[] inputArr = input.toCharArray();

        for (int i = 0; i < inputArr.length; i++) {
            if (inputArr[i] == 'H' || inputArr[i] == 'N'){
                continue;
            }
            for (int j = i - k; j <= i + k; j++) {
                if (j < 0 || i == j){
                    continue;
                }else if (j >= inputArr.length){
                    break;
                }
                if (inputArr[j] == 'H'){
                    result++;
                    inputArr[j] = 'N';
                    break;
                }
            }
        }
        System.out.println(result);

    }
}
