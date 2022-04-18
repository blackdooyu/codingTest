package main.java.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 백준 1080번 행렬
 */
public class Exercise1080 {

    public static int row;
    public static int col;
    public static int[][] A;
    public static int[][] B;
    public static int cnt;
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        row = Integer.parseInt(st.nextToken());
        col = Integer.parseInt(st.nextToken());

        A = new int [row][col];
        B = new int [row][col];

        for(int i = 0 ; i <row; i ++) {
            String str = br.readLine();
            for(int j = 0 ; j < col ; j++)
                A[i][j] = Character.getNumericValue(str.charAt(j));
        }

        for(int i = 0 ; i <row; i ++) {
            String str = br.readLine();
            for(int j = 0 ; j < col ; j++)
                B[i][j] = Character.getNumericValue(str.charAt(j));
        }

        cnt = 0;
        for(int i = 0 ; i < row-2; i++) {
            for(int j = 0 ; j < col-2; j++) {
                if(A[i][j] != B[i][j]) {
                    change(i,j);
                    cnt++;
                }
            }
        }

        boolean check = true;
        for(int i = 0 ; i < row ; i++) {
            for(int j = 0 ; j < col ; j++) {
                if(A[i][j] != B[i][j])
                    check = false;
            }
        }

        if(check){
            System.out.println(cnt);
        } else {
            System.out.println(-1);
        }
    }

    public static void change(int x , int y) {
        for(int i = x ; i <x+3 ; i++) {
            for(int j = y; j<y+3 ; j++) {
                A[i][j] = A[i][j] ^ 1 ;
            }
        }
    }
}
