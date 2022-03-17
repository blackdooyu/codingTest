package main.java.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 백준 1781번 컵라면
 */
public class Exercise1781 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        StringTokenizer st;

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        List<Score> scoreList = new ArrayList<>();


        for (int i = 0; i < count; i++) {
            st = new StringTokenizer(br.readLine());
            scoreList.add(new Score(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())));
        }

        Collections.sort(scoreList, new Comparator<Score>() {
            @Override
            public int compare(Score o1, Score o2) {
                return o1.d - o2.d;
            }
        });

        int result = 0;

        for (int i = 0; i < count; i++) {
            Score score = scoreList.get(i);
            pq.add(score.c);

            while (!pq.isEmpty() && pq.size() > score.d){
                pq.poll();
            }
        }

        while (!pq.isEmpty()) {
            result += pq.poll();
        }

        System.out.println(result);

    }


    static class Score {
        int d;
        int c;

        public Score(int d, int c) {
            this.d = d;
            this.c = c;
        }
    }
}
