package main.java.codingtest;

import java.util.Scanner;

/**
 백준 2720 세탁소 사장 동혁
 **/
public class Exercise2720 {

    public static int[] result(int num) {

        int count[] = new int[4];

        while (num != 0) {

            if (num >= 25){
                count[0]++;
                num -= 25;
            }else if(num >= 10){
                count[1]++;
                num -= 10;
            }else if (num >= 5){
                count[2]++;
                num -= 5;
            }else{
                count[3]++;
                num -= 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        int arr[] = new int[test];

        for (int i = 0; i < test; i++) {
            int num = sc.nextInt();
            arr[i] = num;
        }

        for (int i = 0; i < test; i++) {
            int[] result = result(arr[i]);
            for (int i1 : result) {
                System.out.print(i1+" ");
            }
            System.out.println("");
        }
    }
}
