package main.java.codingtest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
  백준 1475번 방 번호
 **/
public class Exercise1475 {

    public static int result(int num) {
        List<Integer> list = new ArrayList<>();

        while (num != 0){
            int value = num % 10;
            num = num/10;
            list.add(value);
        }
        int arr[] = new int[]{0,0,0,0,0,0,0,0,0,0};

        for(int numbers : list){
            int i = numbers;
            arr[i]++;
        }


        int max = arr[0];
        int sum =0;

        for (int i = 1 ; i < arr.length ; i++){
            if (i != 6 && i != 9 && max < arr[i]){
                max = arr[i];
            }
            if (i == 6 || i == 9){
                sum += arr[i];
            }
        }

        int sixAndNine = 0;

        if (sum != 0) {
            sixAndNine = (sum / 2);
            if (sum % 2 != 0){
                sixAndNine++;
            }
        }

        if (sixAndNine > max){
            return sixAndNine;
        }
        return max;
    }

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        int roomNumber = sc.nextInt();
        int result = Exercise1475.result(roomNumber);
        System.out.println(result);
    }
}
