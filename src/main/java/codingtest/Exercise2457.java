package main.java.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 백준 2457번 공주님의 정원
 */
public class Exercise2457 {

    static int result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int count = Integer.parseInt(br.readLine());
        List<Date> list = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            st = new StringTokenizer(br.readLine());
            list.add(new Date(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())));
        }

        Collections.sort(list, new Comparator<Date>() {
            @Override
            public int compare(Date o1, Date o2) {
                if (o1.lastMonth == o2.lastMonth){
                  return o2.lastDay - o1.lastDay;
                }
                return o2.lastMonth - o1.lastMonth;
            }
        });

        int firstM = 3;
        int firstD = 1;


        while (true){
            boolean check = false;

            for (int i = 0; i < list.size(); i++) {
                Date date = list.get(i);

                if (date.firstMonth <= firstM){
                    if (firstM == date.firstMonth && date.firstDay > firstD){
                        continue;
                    }

                    result++;
                    firstM = date.lastMonth;
                    firstD = date.lastDay;

                    list.remove(i);
                    check = true;
                    break;
                }
            }

            if (firstM > 11){
                break;
            }else if (!check){
                result = 0;
                break;
            }
        }

        System.out.println(result);

    }

    static class Date {
        int firstMonth;
        int firstDay;
        int lastMonth;
        int lastDay;

        public Date(int firstMonth, int firstDay, int lastMonth, int lastDay) {
            this.firstMonth = firstMonth;
            this.firstDay = firstDay;
            this.lastMonth = lastMonth;
            this.lastDay = lastDay;
        }
    }

}
