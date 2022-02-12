package main.java.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 백준 12904번 A와 B
 **/
public class Exercise12904 {

    public static int result(String s , String t) {

        while (s.length() != t.length()){

            if (t.charAt(t.length()-1) == 'A'){
                t = t.substring(0,t.length()-1);
            }else{
                String revers = "";
                char[] chars = t.toCharArray();

                for (int i = t.length()-2; i >= 0; i--) {
                    revers += chars[i];
                }
                t = revers;
            }

        }

        return t.equals(s) ? 1 : 0;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        String t = br.readLine();

        System.out.println(result(s,t));
    }
}
