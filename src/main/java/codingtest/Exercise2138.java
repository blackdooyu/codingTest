package main.java.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
  백준 2138번 전구와 스위치
 **/
public class Exercise2138 {

    public static int result(char[] on , char[] off, String output,int n) {

        int count1 = 1;
        int count2 = 0;

        if (on[0] == '0'){
            on[0] = '1';
            on[1] = on[1] == '0' ? '1' : '0';
        }else {
            on[0] = '0';
            on[1] = on[1] == '0' ? '1' : '0';
        }

        for (int i = 1; i < n; i++) {
            if (on[i-1] != output.charAt(i-1)){
                count1++;
                on[i-1] = on[i-1] == '0' ? '1' : '0';
                on[i] = on[i] == '0' ? '1' : '0';

                if (i+1 <n){
                    on[i+1] = on[i+1] == '0' ? '1' : '0';
                }
            }

            if (off[i-1] != output.charAt(i-1)){
                count2++;
                off[i-1] = off[i-1] == '0' ? '1' : '0';
                off[i] = off[i] == '0' ? '1' : '0';

                if (i+1 <n){
                    off[i+1] = off[i+1] == '0' ? '1' : '0';
                }
            }
        }

        boolean onStr = true;
        boolean offStr = true;

        for (int i = 0; i < on.length; i++) {
           if (off[i] != output.charAt(i)){
               offStr =false;
           }

           if (on[i] != output.charAt(i)){
                onStr =false;
            }
        }

        if (onStr && offStr) {
            return Math.min(count1, count2);
        }else if (!onStr && !offStr){
            return -1;
        }else if (onStr){
            return count1;
        }
        return count2;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();
        String output = br.readLine();
        char[] on = input.toCharArray();
        char[] off = input.toCharArray();

        System.out.println(result(on,off,output,n));

    }
}
