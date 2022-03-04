package main.java.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
  강의실 1374번
 **/
public class Exercise1374 {

    static class Study{
        int n;
        int start;
        int end;

        public Study(int n, int start, int end) {
            this.n = n;
            this.start = start;
            this.end = end;
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        List<Study> studyList = new ArrayList<>();
        PriorityQueue<Study> pq = new PriorityQueue<>(new Comparator<Study>() {
            @Override
            public int compare(Study o1, Study o2) {
                return o1.end - o2.end;
            }
        });

        for (int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            studyList.add(new Study(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())
            ,Integer.parseInt(st.nextToken())));
        }

        Collections.sort(studyList, new Comparator<Study>() {
            @Override
            public int compare(Study o1, Study o2) {
                return o1.start - o2.start;
            }
        });

        for (int i = 0; i < count; i++) {
            Study find = studyList.get(i);

            if (pq.isEmpty()) {
                pq.add(find);
            }else {
                Study peek = pq.peek();
                if (peek.end > find.start){
                    pq.add(find);
                } else if (find.start >= peek.end){
                    pq.remove();
                    pq.add(find);
                }
            }
        }

        System.out.println(pq.size());
    }
}
