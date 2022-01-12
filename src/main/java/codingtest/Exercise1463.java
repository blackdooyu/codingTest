package main.java.codingtest;

import java.util.Scanner;

/**
  백준 1463번 1로 만들기
 **/
public class Exercise1463 {

    public static int result(int x,int count) {

        if (x < 2){
            return count;
        }
        return Math.min(result(x/2,count+1+(x%2)),result(x/3,count+1+(x%3)));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int result = Exercise1463.result(x,0);
        System.out.println(result);
    }
}
