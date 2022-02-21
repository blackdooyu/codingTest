package main.java.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
  백준 13904번 과제
 **/
public class Exercise13904 {

    public static class Assignment {

        public int day;
        public int point;

        public Assignment(int day, int point) {
            this.day = day;
            this.point = point;
        }
    }

    public static int result(List<Assignment> list , int max) {

        int totalScore = 0;

        while (max != 0){
            int index = 0;
            int maxPoint = 0;

            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).day >= max && maxPoint < list.get(i).point){
                    index = i ;
                    maxPoint = list.get(i).point;
                }

            }

            if (maxPoint == 0){
                max--;
                continue;
            }else {
                totalScore += list.get(index).point;
                list.remove(index);
                max--;
            }
        }

        return totalScore;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());
        List<Assignment> list = new ArrayList<>();
        int max = 0;

        for (int i = 0; i < testCase; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int day = Integer.parseInt(st.nextToken());
            int point = Integer.parseInt(st.nextToken());
            list.add(new Assignment(day,point));

            if (max < day){
                max = day;
            }

        }

        System.out.println(result(list,max));
    }

}
