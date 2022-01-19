package main.java.codingtest;

import java.util.Scanner;

/**
 백준 1929번 소수 구하기 X
 **/
public class Exercise1929 {

    public static boolean[] result(int num2 ,boolean arr[]) {

            for (int i = 2; i <= Math.sqrt(num2); i++) {

                for (int j = i * i ; j < arr.length ; j = j + i){
                    arr[j] = true;
                }

            }

            return arr;
        }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        boolean arr[] = new boolean[num2+1];
        StringBuilder sb = new StringBuilder();


        boolean[] result = Exercise1929.result(num2, arr);


        if (num1 == 1){
            num1++;
        }

        for (int i = num1; i < result.length; i++) {
            if (!result[i]){
                sb.append(i + "\n");
            }
        }

        System.out.println(sb);
    }
}
