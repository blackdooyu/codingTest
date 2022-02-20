package main.java.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 백준 1202번 보석 도둑
 **/
public class Exercise1202 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        List<Gem> gemList = new ArrayList<>();
        int kArr[] = new int[k];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            gemList.add(new Gem(m,v));
        }
        Collections.sort(gemList,((o1, o2) -> o1.m  - o2.m));


        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            kArr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(kArr);

        long result = 0;
        int index = 0;
        PriorityQueue<Gem> pq = new PriorityQueue<>((o1, o2) -> o2.v - o1.v);

        for(int i = 0; i < k; i++) {

            while(index < n && gemList.get(index).m <= kArr[i]) {
                pq.add(gemList.get(index++));
            }

            if(!pq.isEmpty()){
                result += pq.poll().v;}
        }
        System.out.println(result);
    }

    public static class Gem {
        int m;
        int v;

        public Gem(int m, int v) {
            this.m = m;
            this.v = v;
        }
    }
}
