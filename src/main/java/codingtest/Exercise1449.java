package main.java.codingtest;

import java.util.Arrays;
import java.util.Scanner;

/**
 백준 1449번 수리공 항승
 **/
public class Exercise1449 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int tape = sc.nextInt();
        int arr[] = new int[count];

        for (int i = 0; i < count; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.println(result(arr,tape));


    }

    public static int result(int[] arr,int tape) {

        int count = 0;

        int tapeRange = (int)(arr[0] - 0.5 + tape);
        count ++;

        Arrays.sort(arr);

        for(int i=1; i<arr.length; i++) {
            if (tapeRange < (int)(arr[i] + 0.5)){
                tapeRange = (int)(arr[i] - 0.5 + tape);
                count ++;
            }
        }
        return count;
    }
}

