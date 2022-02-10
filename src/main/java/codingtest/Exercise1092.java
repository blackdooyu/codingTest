package main.java.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
  백준 1092번 배
 **/
public class Exercise1092 {

    public static int result(Integer arr1[],List<Integer> list) {
        int count = 0 ;

        if (arr1[0] < list.get(0)){
            return -1;
        }

        while (!list.isEmpty()){
            int index = 0;

            for (int i = 0; i < arr1.length;) {

                if (index == list.size()){
                    break;
                }else if(arr1[i] >= list.get(index)){
                    list.remove(index);
                    i++;
                }else {
                    index++;
                }

            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        Integer arr1[] = new Integer[n];
        int m = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr1[i] = Integer.parseInt(st1.nextToken());
        }

        for (int i = 0; i < m; i++) {
            list.add(Integer.parseInt(st2.nextToken()));
        }

        Arrays.sort(arr1, Comparator.reverseOrder());
        list.sort(Comparator.reverseOrder());

        System.out.println(result(arr1,list));
    }
}
