package main.java.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 백준 1343번 폴리오미노
 */
public class Exercise1343 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String result = "";
        String a = "AAAA";
        String b = "BB";

        for (int i = 0; i < str.length();) {
            int count = 0;
            String x = "";

            for (int j = i ; j < str.length(); j++){
                if (str.charAt(j) == 'X'){
                    count++;
                }else if (str.charAt(j) == '.'){
                    x += ".";
                    if (str.length() > j+1 && str.charAt(j+1) != '.'){
                        break;
                    }
                }
            }

            if (count % 2 !=0){
                result = "-1";
                break;
            }

            int aCount = count/4;
            int bCount = (count%4)/2;

            for (int k = 0; k < aCount; k++) {
                result += a;
            }

            for (int l = 0; l < bCount; l++) {
                result += b;
            }

            result += x;
            i += count+x.length();
        }

        System.out.println(result);
    }
}
