package main.java.codingtest;

import java.util.Arrays;
import java.util.Scanner;

/**
  백준 1744번 수 묶기
 **/
public class Exercise1744 {

    public static int result(int arr[]) {
        int sum = 0;
        int count = 0;
        int index = 0;
        boolean indexCheck = true;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0){
                count++;

                if (indexCheck){
                    index = i;
                    indexCheck = false;
                }
            }
        }

        boolean check = false;

        if (count % 2 == 0) {
            check =true;
        }

        for (int i = 0; i < arr.length; i++) {

            if (i < arr.length-1) {

                if (arr[i] < 0 && arr[i + 1] <= 0) {
                    sum += arr[i] * arr[i + 1];
                    i++;
                    continue;
                }

                if (check && arr[i] > 0) {

                    if (arr[i] == 1){
                        sum += 1 + arr[i+1];
                        i++;
                        continue;
                    }

                    sum += arr[i] * arr[i + 1];
                    i++;
                    continue;
                }
            }
            sum += arr[i];

            if (count % 2 != 0 && index == i) {
                check = true;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[] = new int[num];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.println(result(arr));
    }
}
