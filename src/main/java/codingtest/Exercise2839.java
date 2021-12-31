package main.java.codingtest;

import java.util.Scanner;

/**
 * 백준 2839 설탕 배달
 **/
public class Exercise2839 {

    public static int minResult(int sugar) {

        int count = 0;
        while (true){
            if (sugar % 5 == 0) {
                return (count)+sugar/5;
            }
            count += 1;
            sugar -= 3;

            if (sugar == 0){
                return count;
            } else if (sugar < 0) {
                return -1;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int result = Exercise2839.minResult(sc.nextInt());

        System.out.println(result);
    }
}
