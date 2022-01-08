package main.java.codingtest;

import java.util.Scanner;

/**
  백준 1978번 소수찾기
 **/
public class Exercise1978 {

    public static int result(int[] numbers) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            boolean check = true;

            if (numbers[i] == 1){
                check =false;
            }

            for (int j = 2; j < numbers[i]; j++) {
                if (numbers[i] % j == 0){
                    check = false;
                    break;
                }
            }

            if (check){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int eachCount = sc.nextInt();
        int arr[] = new int[eachCount];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int result = Exercise1978.result(arr);
        System.out.println(result);

    }
}
