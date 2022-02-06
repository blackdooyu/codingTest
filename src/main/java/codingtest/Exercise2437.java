package main.java.codingtest;

import java.util.Arrays;
import java.util.Scanner;

/**
  백준 2437번 저울
 **/
public class Exercise2437 {

    public static int result(int arr[]) {
        int sum = arr[0];

        if (sum != 1){
            return 1;
        }

        for (int i = 1; i < arr.length; i++) {
            if (sum+1 < arr[i]){
               return sum+1;
            }
            sum += arr[i];
        }
        return sum+1;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int arr[] = new int[count];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        System.out.println(result(arr));
    }
}
