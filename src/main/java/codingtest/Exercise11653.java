package main.java.codingtest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
  백준 11653 소인수 분해
 **/
public class Exercise11653 {
    static List<Integer> result(int num) {
        List<Integer> list = new ArrayList<>();

        while (true){
            for (int i = 2; i <= num; i++) {
                if (num % i == 0){
                    list.add(i);
                    num = num/i;
                    break;
                }
            }
            if (num == 1){
                break;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        List<Integer> result = Exercise11653.result(num);
        for (Integer integer : result) {
            System.out.println(integer);
        }
    }
}
