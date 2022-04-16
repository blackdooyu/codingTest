package main.java.codingtest;

import java.io.*;
import java.util.Stack;

/**
 * 백준 4889번 안정적인 문자열
 */
public class Exercise4889 {

    static int index = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true){
            String str = br.readLine();
            if (str.contains("-")){
                break;
            }

            Stack<Character> stack = new Stack<>();
            int result = 0;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i)=='{'){
                    stack.push(str.charAt(i));
                }else if (str.charAt(i) == '}'){
                    if (stack.isEmpty()){
                        result++;
                        stack.push('{');
                    }else {
                        stack.pop();
                    }
                }
            }

            result += stack.size()/2;

            bw.write(index++ +"."+" "+result+"\n");
        }

        bw.flush();
    }
}
