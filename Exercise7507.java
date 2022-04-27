package main.java.codingtest;

import java.io.*;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

/**
 * 백준 7507번 올림픽 게임
 */
public class Exercise7507 {

    static StringTokenizer st;

    static class Time{
        int day;
        int start;
        int end;

        public Time(int day, int start, int end) {
            this.day = day;
            this.start = start;
            this.end = end;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int count = Integer.parseInt(br.readLine());
            PriorityQueue<Time> pq = new PriorityQueue<>(new Comparator<Time>() {
                @Override
                public int compare(Time o1, Time o2) {
                    if (o1.day == o2.day){
                        return o1.end - o2.end;
                    }
                    return o1.day - o2.day;
                }
            });

            for (int j = 0; j < count; j++) {
                st = new StringTokenizer(br.readLine());
                pq.add(new Time(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())));
            }

            Time startTime = pq.poll();
            int sum = 1;

            while (!pq.isEmpty()) {
                Time time = pq.poll();

                if (startTime.end <= time.start || startTime.day < time.day){
                    sum++;
                    startTime = time;
                }
            }

            bw.write("Scenario #"+(i+1)+":\n"+sum+
                    "\n\n");
        }
        bw.flush();
    }
}
