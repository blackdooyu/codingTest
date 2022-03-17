package main.java.codingtest;

import java.io.*;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

/**
 * 백준 13975번 파일 합치기 3
 */
public class Exercise13975 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        PriorityQueue<Long> pq;
        StringTokenizer st;

        for (int i = 0; i < testCase; i++) {
            int count = Integer.parseInt(br.readLine());
            long result = 0;
            st = new StringTokenizer(br.readLine());
            pq = new PriorityQueue<>();

            for (int j = 0 ; j <count ; j++){
                pq.add(Long.parseLong(st.nextToken()));
            }
            while (!pq.isEmpty() && pq.size() != 1){
                Long n1 = pq.poll();
                Long n2 = pq.poll();

                result += n1 + n2;
                pq.add(n1+n2);
            }
            bw.append(result+"\n");
        }

        bw.flush();
        bw.close();
    }
}
