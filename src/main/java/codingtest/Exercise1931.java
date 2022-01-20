package main.java.codingtest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 백준 1931번 회의실 배정
 **/
public class Exercise1931 {

    public static int result(int[][] arr) {
        int count = 0;
        int next = 0;

        for (int i = 0; i < arr.length; i++) {

            if (next <= arr[i][0]){
                next = arr[i][1];
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int arr[][] = new int[count][2];

        for (int i = 0; i < count; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {

                if (o1[1] == o2[1]){
                    return o1[0] - o2[0];
                }

               return o1[1] - o2[1] ;
            }
        });


        System.out.println(result(arr));
    }
}
