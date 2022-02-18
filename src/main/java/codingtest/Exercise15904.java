package main.java.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 백준 15904번 UCPC는 무엇의 약자일까?
 **/
public class Exercise15904 {

    public static String result(String str) {

        int index = 0;
        String success = "I love UCPC";
        String fail = "I hate UCPC";

        for (String s : str.split("")) {
            if (index == 0 && s.equals("U")){
                index++;
            }else if ((index == 1 || index == 3)  && s.equals("C")){
                index++;
            }else if (index == 2 && s.equals("P")){
                index++;
            }
            if (index == 4){
                break;
            }
        }

        return index == 4 ? success : fail;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        System.out.println(result(str));
    }
}
