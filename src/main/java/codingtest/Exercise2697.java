package main.java.codingtest;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 백준 2697번 다음 수 구하기
 */
public class Exercise2697 {

    static String sort(char[] arr, int idx) {
        List<Integer> numList = new ArrayList<>();

        for (int i = idx; i < arr.length; i++) {
            numList.add(Character.getNumericValue(arr[i]));
        }
        Collections.sort(numList);
        String subStr = String.valueOf(arr);
        String result = subStr.substring(0, idx);

        for (int i = 0; i < numList.size(); i++) {
            if (numList.get(i) > Character.getNumericValue(arr[idx])){
                result += numList.get(i);
                numList.remove(i);
                break;
            }
        }

        for (int i = 0; i < numList.size(); i++) {
            result += numList.get(i);

        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            char[] charArr = str.toCharArray();
            int idx = 0;

            for (int j = 1; j < charArr.length; j++) {
               if (charArr[j] > charArr[j-1]){
                   idx = j-1;
               }
            }

            if (idx == 0){
                bw.write("BIGGEST \n");
                continue;
            }

            String result = sort(charArr, idx);
            bw.write(result+"\n");
        }

        bw.flush();
    }
}
