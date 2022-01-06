package main.java.codingtest;

import java.util.Scanner;

/**
  백준 2609번 최대공약수와 최소공배수
 **/
public class Exercise2609 {

    public static int result(int a,int b) {

        if (b == 0){
            return a;
        }

        return result(b,a%b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (b > a){
            int tmp = a;
            a = b;
            b= tmp;
        }

        int result = Exercise2609.result(a, b);

        System.out.println(result);
        System.out.println((a*b)/result);
    }
}
