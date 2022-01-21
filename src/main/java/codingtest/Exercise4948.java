package main.java.codingtest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
  백준 4948번 베르트랑 공준
 **/
public class Exercise4948 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        while (true){
            int num = sc.nextInt();

            if (num == 0){
                break;
            }

            list.add(num);
        }

        int arr[] = new int[list.size()];

        int[] result = result(list, 0, arr);
        for (int i : result) {
            System.out.println(i);
        }

    }

    public static int[] result(List<Integer> list , int count,int arr[]) {

        Integer num = list.get(count);
        boolean check[] = new boolean[(num*2)+1];
        int result = 0;

        for (int i = 2 ; i <= Math.sqrt(num*2) ; i++){
            for (int j = i * i ; j <= num*2 ; j += i){
                check[j] = true;
            }
        }

        if (num == 1){
            result = 1;
        }

        if (num != 1) {
            for (int i = num+1; i < check.length; i++) {
                if (!check[i]) {
                    result++;
                }
            }
        }

        arr[count] = result;

        if (count < list.size()-1){
            return result(list,count+1,arr);
        }

        return arr;
    }

}
