package main.java.codingtest;

import java.util.Scanner;

/**
 백준 1049번 기타줄
**/
public class Exercise1049 {

    public static int result(int quantity, int arr[][] ,int count) {
        int minPrice1 = arr[0][0];
        int minPrice2 = arr[0][1];

        for (int i = 1; i < count; i++) {
            if (minPrice1 > arr[i][0]){
                minPrice1 = arr[i][0];
            }

            if (minPrice2 > arr[i][1]){
                minPrice2 = arr[i][1];
            }
        }

        int setCount = quantity/6;
        if (quantity%6 != 0){
            setCount += 1;
        }

        int totalPrice1 = minPrice1 * setCount;
        int totalPrice2 = minPrice2 * quantity;
        int totalPrice3 = 0;

        if (quantity % 6 != 0){
            totalPrice3 = (minPrice1 * (setCount-1)) + (minPrice2 *(quantity % 6));
        }


        if (totalPrice3 == 0){
            return totalPrice1 < totalPrice2 ? totalPrice1 : totalPrice2;
        }
        int result = totalPrice1 < totalPrice2 ? totalPrice1 : totalPrice2;

        return result < totalPrice3 ? result :totalPrice3;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int quantity =sc.nextInt();
        int count = sc.nextInt();
        int arr[][] = new int[count][2];

        for (int i = 0; i < count; i++) {
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
        }

        System.out.println(Exercise1049.result(quantity,arr,count));
    }
}
