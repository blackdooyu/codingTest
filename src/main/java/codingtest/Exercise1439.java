package main.java.codingtest;

import java.util.Scanner;

/**
  백준 1439번 뒤집기
 **/
public class Exercise1439 {

    public static int result(char arr[]) {
        int zero = 0 ;
        int one = 0;

        if (arr[0] == '0'){
            zero++;
        }else {
            one++;
        }

        for (int i = 1; i < arr.length; i++) {

            if (arr[i - 1] != arr[i]) {

                if (arr[i] == '0') {
                    zero++;
                }else {
                    one++;
                }

            }
        }
        return zero < one ? zero : one;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String numList = sc.next();
        char[] arr = numList.toCharArray();

        System.out.println(result(arr));
    }
}
