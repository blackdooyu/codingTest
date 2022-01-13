package main.java.codingtest;

import java.util.Scanner;

/**
 백준 11582 치킨 TOP N
 **/
public class Exercise11582 {
    static int[] result(int arr[] ,int sort) {
        int cut = arr.length/sort;
        int index = 0;
        boolean check = true;

        while (check){

            for (int i = index; i < arr.length; i++) {
                int min = i;

                for (int j = i+1 ; j < index+cut ;j++){
                    if (arr[min] > arr[j]){
                        min = j;
                    }
                }
                int tmp = arr[i];
                arr[i] = arr[min];
                arr[min] =tmp;

            }

            index += cut;

            if (index == arr.length){
                check =false;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int arr[] = new int[count];

        for (int i = 0; i < arr.length; i++) {
            arr[i] =sc.nextInt();
        }

        int human = sc.nextInt();

        int[] result = Exercise11582.result(arr, human);

        for (int i : result) {
            System.out.print(i+" ");
        }
    }
}
