package main.java.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
  백준 10775번 공항
 **/
public class Exercise10775 {

    public static int gate[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        gate = new int[Integer.parseInt(br.readLine())+1];
        int count = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i = 1; i < gate.length; i++) {
            gate[i] = i;
        }


        for (int i = 0; i < count; i++) {
            int plane = Integer.parseInt(br.readLine());

            int p = find(plane);
            if (p == 0){
                break;
            }else {
                result++;
                change(p,p-1);
            }

        }
        System.out.println(result);

    }

    public static int find(int plane) {
        if (plane == gate[plane]){
            return plane;
        }

        return gate[plane] = find(gate[plane]);
    }

    public static void change(int x, int y){
        x = find(x);
        y = find(y);

        if (x != y) {
            gate[x] = y;
        }
    }
}
