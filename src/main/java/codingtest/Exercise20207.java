package main.java.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 백준 20207번 달력
 */
public class Exercise20207 {

    static Day[] days;
    static int result;
    static StringTokenizer st;
    static int day[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        days = new Day[n];
        day = new int[366];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            days[i] = new Day(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        Arrays.sort(days);

        int min = 0;
        int max = 0;

        for (int i = 0; i < n; i++) {
            if (min ==0){
                min = days[i].start;
                max = days[i].end;
            }

            if (max+1 >= days[i].start){
                for (int j = days[i].start; j <= days[i].end; j++) {
                    day[j]++;
                }
                max = Math.max(max,days[i].end);
            }

            if(max+1 < days[i].start || i == n-1){
                if (max+1 < days[i].start && i != n-1){
                    i--;
                }

                int y = 0;
                for (int k = min; k <= max; k++) {
                    y = Math.max(y,day[k]);
                }

                result += ((max-min)+1) * y;
                min = 0;
                max = 0;

            }

        }

        System.out.println(result);
    }

    static class Day implements Comparable<Day>{
        int start;
        int end;

        public Day(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Day o) {
            if (this.start == o.start){
                return o.end - this.end;
            }

            return this.start - o.start;
        }
    }
}
