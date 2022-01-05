package main.java.codingtest;

import java.util.Scanner;

/**
  백준 2805번 나무자르기 X
 **/
public class Exercise2805 {

    public static int result(int m , int tree[],int mid,boolean check){

        while (true) {
            int sum = 0;

            for (int i = 0; i < tree.length; i++) {
                if (tree[i] > mid) {
                    sum += (tree[i] - mid);
                }
            }

            if (sum == m){
                return mid;
            }

            if (sum > m){
                if (check){
                    return mid;
                }
                mid++;
            }
            if (sum < m){
                if (!check){
                    return mid-1;
                }
                mid--;
            }

        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tree[] = new int[sc.nextInt()];

        int m = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < tree.length; i++) {
            tree[i] = sc.nextInt();
            sum += tree[i];
        }

        int mid = sum/tree.length;
        int midLength = 0;
        boolean check = true;

        for (int i = 0 ; i < tree.length ; i++){
            if (tree[i] > mid){
                midLength += (tree[i] - mid);
            }
        }

        if (midLength >= m){
            check = false;
        }

        int result = Exercise2805.result(m, tree,mid,check);

        System.out.println(result);
    }
}
