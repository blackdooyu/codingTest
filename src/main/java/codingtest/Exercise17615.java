package main.java.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 백준 17615번 볼 모으기
 */
public class Exercise17615 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String count = br.readLine();
        String ball = br.readLine();
        char[] balls = ball.toCharArray();

        int red = 0;
        int blue = 0;

        red = getRed(balls, red);
        blue = getBlue(balls, blue);

        int totalRed = 0;
        int totalBlue = 0;

        for (int i = 0; i < balls.length; i++) {
            if (balls[i] == 'R'){
                totalRed++;
            }else {
                totalBlue++;
            }
        }
        System.out.println(Math.min((totalRed - red) , (totalBlue - blue)));
    }

    private static int getBlue(char[] balls, int blue) {
        if (balls[0] == 'B') {
            blue++;
            for (int i = 1; i < balls.length; i++) {
                if (balls[i] == 'B') {
                    blue++;
                } else {
                    break;
                }
            }
        }
         if (balls[balls.length-1] == 'B'){
            int reversBlue = 0;
            for (int i = balls.length-1; i >= 0; i--) {
                if (balls[i] == 'B') {
                    reversBlue++;
                } else {
                    blue = Math.max(blue, reversBlue);
                    break;
                }
            }
        }
        return blue;
    }

    private static int getRed(char[] balls, int red) {
        if (balls[0] == 'R') {
            red++;
            for (int i = 1; i < balls.length; i++) {
                if (balls[i] == 'R') {
                    red++;
                } else {
                    break;
                }
            }
        }
         if (balls[balls.length-1] == 'R'){
            int reversRed = 0;
            for (int i = balls.length-1; i >= 0; i--) {
                if (balls[i] == 'R') {
                    reversRed++;
                } else {
                    red = Math.max(red, reversRed);
                    break;
                }
            }
        }
        return red;
    }
}
