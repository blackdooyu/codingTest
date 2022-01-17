package main.java.codingtest;

import java.util.Scanner;

/**
 1065번 한수
 **/
public class Exercise1065 {

    public static int result(int num) {
        int count = 99;

        if (num < 100){
            return num;
        }else if(num == 1000){
            num = 999;
        }

        for (int i = 100; i <= num; i++) {
            int num1 = i/100;
            int num2 =(i/10)%10;
            int num3 = i%10;
            if ((num1 - num2) == (num2 - num3)){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(Exercise1065.result(num));
    }
}
