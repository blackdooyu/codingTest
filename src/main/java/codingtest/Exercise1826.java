package main.java.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 백준 1826번 연료 채우기
 */
public class Exercise1826 {

    static class Place {
        public int length;
        public int oil;

        public Place(int length, int oil) {
            this.length = length;
            this.oil = oil;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        List<Place> list = new ArrayList<>();
        PriorityQueue<Place> pq = new PriorityQueue<>((o1, o2) -> o1.length - o2.length);

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            pq.add(new Place(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())));
        }

        st = new StringTokenizer(br.readLine());

        int totalLength = Integer.parseInt(st.nextToken());
        int startOil = Integer.parseInt(st.nextToken());

        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());

        int result= 0;

        while (startOil < totalLength){
            while (!pq.isEmpty() && pq.peek().length <= startOil){
                pq2.add(pq.poll().oil);
            }

            if (pq2.isEmpty()){
                result = -1;
                break;
            }

            result++;
            startOil += pq2.poll();
        }

        System.out.println(result);

    }
}
