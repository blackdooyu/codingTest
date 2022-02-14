package main.java.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
  백준 1461번 도서관
 **/
public class Exercise1461 {

    public static int result(PriorityQueue<Integer> sumQ ,PriorityQueue<Integer> subtractQ ,int max) {
        int maxV = 0;

        if (sumQ.isEmpty()) {
            maxV = subtractQ.peek();
        } else if (subtractQ.isEmpty()) {
            maxV = sumQ.peek();
        } else {
            maxV = Math.max(sumQ.peek(), subtractQ.peek());
        }

        int result = 0;

        while (!sumQ.isEmpty()) {
            int temp = sumQ.poll();
            for (int i = 0; i < max - 1; i++) {
                sumQ.poll();

                if (sumQ.isEmpty()) {
                    break;
                }
            }
            result += temp * 2;
        }

        while (!subtractQ.isEmpty()) {
            int temp = subtractQ.poll();
            for (int i = 0; i < max - 1; i++) {
                subtractQ.poll();

                if (subtractQ.isEmpty()) {
                    break;
                }
            }
            result += temp * 2;
        }

        result -= maxV;
        return result;
    }



    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        StringTokenizer st1 = new StringTokenizer(str1);

        int count = Integer.parseInt(st1.nextToken());
        int max = Integer.parseInt(st1.nextToken());

        String str2 = br.readLine();
        StringTokenizer st2 = new StringTokenizer(str2);

        PriorityQueue<Integer> sumQ = new PriorityQueue<>((p1, p2) -> p2 - p1);
        PriorityQueue<Integer> subtractQ = new PriorityQueue<>((p1, p2) -> p2 - p1);

        for (int i = 0; i < count; i++) {
           int num = Integer.parseInt(st2.nextToken());

            if (num > 0) {
                sumQ.offer(num);
            } else {
                subtractQ.offer(Math.abs(num));
            }
        }

        System.out.println(result(sumQ,subtractQ,max));
    }

}
