package main.java.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 백준 11479번 통나무 건너뛰기
 **/
public class Exercise11497 {

    public static int result(int arr[]){

            int arrSort[] = new int[arr.length];
            int index = 0;

            for (int i = 0; i < arr.length -1; i += 2) {
                arrSort[index] = arr[i];
                arrSort[arr.length-index-1] = arr[i+1];
                index++;
            }

            if (arr.length % 2 != 0){
                arrSort[(arrSort.length/2)] = arr[arr.length-1];
            }


            int max = arrSort[arr.length-1] - arrSort[0];

            for (int i = 0 ; i < arr.length - 1; i++) {
                int maxCheck = 0;

                if (arrSort[i] > arrSort[i+1]){
                    maxCheck = arrSort[i] - arrSort[i+1];
                }else{
                    maxCheck = arrSort[i+1]-arrSort[i];
                }

                if (max < maxCheck){
                    max = maxCheck;
                }
            }
            return max;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        int result[] = new int[count];

        for (int i = 0; i < count; i++) {
            int arr[] = new int[Integer.parseInt(br.readLine())];
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 0; j < arr.length; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            result[i] = result(arr);
        }

        for (int i : result) {
            System.out.println(i);
        }
    }
}
