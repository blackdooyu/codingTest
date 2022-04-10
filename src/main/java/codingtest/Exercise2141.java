package main.java.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 백준 2141번 우체국
 */
public class Exercise2141 {

    static class Village implements Comparable<Village>{
        long x;
        long a;

        public Village(long x, long a) {
            this.x = x;
            this.a = a;
        }


        @Override
        public int compareTo(Village o) {
            if (this.x == o.x){
                return (int) (this.a - o.a);
            }
            return (int) (this.x - o.x);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        Village village[] = new Village[n];

        long total = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            long x = Long.parseLong(st.nextToken());
            long a = Long.parseLong(st.nextToken());
            village[i] = new Village(x,a);
            total += a;
        }

        Arrays.sort(village);

        long sum = 0;

        for (Village v : village) {
            sum += v.a;

            if (sum >= (total+1)/2){
                System.out.println(v.x);
                break;
            }
        }

    }
}
