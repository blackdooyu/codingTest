package main.java.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 백준 20365번 블로그2
 */
public class Exercise20365 {

    static int red = 1;
    static int blue = 1;
    static boolean checkRed , checkBlue;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String blog = br.readLine();
        char[] color = blog.toCharArray();


        for (char c : color) {
            if (c == 'B' && !checkRed) {
                red++;
                checkRed = true;
                checkBlue = false;
            } else if (c == 'R' && !checkBlue) {
                blue++;
                checkBlue = true;
                checkRed = false;
            }
        }

        System.out.println(Math.min(red,blue));
    }
}
