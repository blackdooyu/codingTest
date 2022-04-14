package main.java.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 백준 1263번 시간 관리
 */
public class Exercise1263 {

    static Time[] times;
    static int result;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        times = new Time[n];

        for (int i = 0; i < n; i++) {
            st= new StringTokenizer(br.readLine());
            times[i] = new Time(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        Arrays.sort(times);

        result = times[0].endTime - times[0].startTime;

        for (int i = 1; i < times.length; i++) {
            if(result < times[i].endTime) {
                result = result - times[i].startTime;
            }else{
                result = times[i].endTime - times[i].startTime;
            }
        }

        System.out.println(result >= 0 ? result : -1);
    }

    static class Time implements Comparable<Time>{
        int startTime;
        int endTime;

        public Time(int startTime, int endTime) {
            this.startTime = startTime;
            this.endTime = endTime;
        }


        @Override
        public int compareTo(Time o) {
            return o.endTime - this.endTime;
        }
    }
}
