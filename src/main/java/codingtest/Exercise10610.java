package main.java.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

/**
  백준 10610번 30
 **/
public class Exercise10610 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[] chars = str.toCharArray();
        Integer[] arr = new Integer[chars.length];
        boolean zeroCheck = false;
        int sum = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0'){
                zeroCheck =true;
            }
            arr[i] = Character.getNumericValue(chars[i]);
            sum += Character.getNumericValue(chars[i]);
        }

        if (!zeroCheck || sum % 3 != 0) {
            System.out.println(-1);
        }else {
            Arrays.sort(arr,Collections.reverseOrder());
            String result = "";

            for (int i : arr) {
                result += i;
            }

            System.out.println(result);
        }
    }
}
