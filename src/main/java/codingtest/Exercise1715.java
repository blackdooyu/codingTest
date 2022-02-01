package main.java.codingtest;


import java.util.PriorityQueue;
import java.util.Scanner;

/**
  백준 1715번 카드 정렬하기
 **/
public class Exercise1715 {

    public static Long result(PriorityQueue<Long> pq) {

      Long num = 0L;

      while (pq.size() >1){
          Long temp1 = pq.poll();
          Long temp2 = pq.poll();

          num += temp1 + temp2;
          pq.add(temp1 + temp2);
      }
      return num;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        PriorityQueue<Long> pq = new PriorityQueue<>();

        for (int i = 0; i < count; i++) {
            pq.add(sc.nextLong());
        }

        System.out.println(result(pq));
    }
}
