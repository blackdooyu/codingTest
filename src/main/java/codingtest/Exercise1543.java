package main.java.codingtest;

import java.util.Scanner;

/**
  백준 1543번 문서 검색
 **/
public class Exercise1543 {

    public static int result(String str1,String str2) {
        boolean check = true;
        int index = 0;
        int strLength = str2.length();
        int count = 0;

        while (check){

            for (int i = index ; i < str1.length() ; i++) {

                if (str1.charAt(i) == str2.charAt(0) && i+strLength <= str1.length()) {
                    String sum = str1.substring(i, i+strLength);

                    if (sum.equals(str2)) {
                        ++count;
                        index = i + strLength;
                        break;
                    }
                }
                if (i == str1.length()-1){
                    check =false;
                }
            }

            if (index >= str1.length()){
                check = false;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        int result = Exercise1543.result(str1, str2);
        System.out.println(result);
    }

}
