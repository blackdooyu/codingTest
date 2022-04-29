package main.java.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * 백준 5002번 도어맨
 */
public class Exercise5002 {

    static int result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        char[] sex = str.toCharArray();

        Stack<Character> manStack = new Stack<>();
        Stack<Character> womanStack = new Stack<>();

        for (int i = 0; i < sex.length; i++) {
            if (sex[i] == 'M'){
                manStack.push(sex[i]);
            }else {
                womanStack.push(sex[i]);
            }

            while (!manStack.isEmpty() && !womanStack.isEmpty()) {
                manStack.pop();
                womanStack.pop();
                result += 2;
            }

            if (manStack.size() > n){
                if (i + 1 < sex.length && sex[i+1] == 'M'){
                    result += n;
                    manStack.clear();
                    break;
                }
            }else if(womanStack.size() > n){
                if (i + 1 < sex.length && sex[i+1] == 'W'){
                    result += n;
                    womanStack.clear();
                    break;
                }
            }
        }
        System.out.println(result+manStack.size()+womanStack.size());
    }
}
