package main.java.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 백준 10989번 수 정렬하기3
  버블정렬로는 시간초과가 되기때문에 다른 정렬 알고리즘을 공부해야함
 **/
public class Exercise10989 {

    public static int[] sort(int number[]) throws IOException {

        for (int i = 1; i < number.length; i++) {

            for (int j = 0; j < number.length - i; j++) {
                if (number[j] > number[j+1]){
                    int tmp = number[j];
                    number[j] = number[j+1];
                    number[j+1] = tmp;
                }
            }
        }
        return number;
    }

    public static void main(String[] args) throws IOException{

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int num[] = new int[Integer.parseInt(bf.readLine())];

        for (int i = 0 ; i < num.length ; i++){
            num[i] = Integer.parseInt(bf.readLine());
        }


        int[] sort = Exercise10989.sort(num);

        for (int sortNum : sort) {
            System.out.println(sortNum);
        }
    }

}
