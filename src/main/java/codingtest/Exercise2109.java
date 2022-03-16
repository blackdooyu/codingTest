package main.java.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

/**
 * 백준 2109번 순회강연
 */
public class Exercise2109 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        boolean check[] = new boolean[10000+1];
        PriorityQueue<Day> pq = new PriorityQueue<Day>(new Comparator<Day>() {
            @Override
            public int compare(Day o1, Day o2) {
                return o2.price - o1.price;
            }
        });

        for (int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            pq.add(new Day(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }

        int result = 0;

        while (!pq.isEmpty()){
            Day peek = pq.peek();

            for (int i = peek.day ; i > 0 ;i--) {
                if (!check[i]) {
                    result += peek.price;
                    check[i] = true;
                    break;
                }
            }
            pq.poll();
        }

        System.out.println(result);
    }


    static class Day {
        private int price;
        private int day;

        public Day(int price, int day) {
            this.price = price;
            this.day = day;
        }
    }
}
