package main.java.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 백준 2812번 크게 만들기
 **/
public class Exercise2812 {

    public static String result(char[] arr , int delete) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int range = arr.length - delete;

        for (int i = 0; i < arr.length; i++) {
           while (!stack.isEmpty() && delete > 0 && stack.peek() < arr[i]){
               stack.pop();
               delete--;
           }

           stack.push(arr[i]);
        }

        while (true){
            if (stack.size() == range){
                break;
            }

            stack.pop();
        }

       while (!stack.isEmpty()){
           sb.append(stack.pop());
       }

        return sb.reverse().toString();
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);

        int range = Integer.parseInt(st.nextToken());
        int deleteCount = Integer.parseInt(st.nextToken());
        String str = br.readLine();

        System.out.println(result(str.toCharArray(), deleteCount));

    }
}
