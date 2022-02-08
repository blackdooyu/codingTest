package main.java.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

/**
 백준 11000번 강의실 배정
 **/
public class Exercise11000 {

    public static int result(int arr[][]) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(arr[0][1]);

        for (int i = 1; i < arr.length; i++) {
            if (pq.peek() <= arr[i][0]){
                pq.poll();
            }

            pq.offer(arr[i][1]);
        }
        return pq.size();
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        int arr[][] = new int[testCase][2];

        for (int i = 0; i < testCase; i++) {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if ( o1[0] == o2[0]){
                   return o1[1] - o2[1];
                }
                return o1[0] - o2[0];
            }
        });

        System.out.println(result(arr));
    }

}
