package main.java.codingtest;

import java.util.Scanner;

/**
  백준 10872 팩토리얼
 **/
public class Exercise10872 {

    public static int result(int num) {

       if (num == 0 || num == 1){
           return 1;
       }
       int result = num;

       while (true){
           result *= (num-1) ;
           --num;

           if (num == 1){
               break;
           }
       }
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int result = Exercise10872.result(num);

        System.out.println(result);
    }
}
