package main.java.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 백준 1541번 잃어버린 괄호
 **/
public class Exercise1541 {

    public static int result(String math) {
        String[] split = math.split("-");
        int sum = Integer.MAX_VALUE;

        for (int i = 0; i < split.length; i++) {
            int temp = 0;

            String[] sumSplit = split[i].split("\\+");

            for (int j = 0; j < sumSplit.length; j++) {
                temp += Integer.parseInt(sumSplit[j]);
            }

            if (sum == Integer.MAX_VALUE){
                sum = temp;
            } else {
                sum -= temp;
            }
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String math = br.readLine();

        System.out.println(result(math));

        br.close();
    }
}
