package main.java.codingtest;

import java.util.Scanner;

/**
 백준 11047번 동전 0
 **/
public class Exercise11047 {

    public static int result(int arr[],int price) {
        int count = 0;
        int index = arr.length -1;

      while (price != 0){

          if (arr[index] > price){
              index--;
              continue;
          }

              price -= arr[index];
              count++;
      }

      return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int coin = sc.nextInt();
        int price = sc.nextInt();

        int arr[] = new int[coin];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int result = Exercise11047.result(arr, price);

        System.out.println(result);
    }
}
