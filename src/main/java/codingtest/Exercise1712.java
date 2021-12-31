package main.java.codingtest;

import java.util.Scanner;

/**
 백준 1712번 손익분기점 문제
 **/

public class Exercise1712 {

   public static int result(int fixPrice,int totalPrice,int count) {

        while (fixPrice >= 0){

            fixPrice -= totalPrice;
            count++;

        }

        return count;
   }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int fixPrice = sc.nextInt(); //고정 지출
        int eachPrice = sc.nextInt(); // 생산 할때마다 지출
        int productPrice = sc.nextInt(); // 상품 가격

        if(eachPrice >= productPrice){
            System.out.println("-1");
            return;
        }

        int result = Exercise1712.result(fixPrice, productPrice - eachPrice, 0);

        System.out.println(result);

    }
}
