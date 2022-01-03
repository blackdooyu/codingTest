package main.java.codingtest;

import java.util.ArrayList;
import java.util.List;

/**
  백준 4673 셀프 넘버
 **/
public class Exercise4673 {

    public static List<Integer> result(List<Integer> numList) {

        Integer count = 1;

        while (count < 10001){

               Integer check = count;
               Integer result = count;

              while (check != 0){
                  result += check % 10;
                  check = check/10;
              }

               if (result < 10001) {
                   numList.remove(result);
               }

            count++;
        }
        return numList;
    }

    public static void main(String[] args) {

        List<Integer> numList = new ArrayList<>();

        for (int i = 1; i < 10001; i++) {
            numList.add(i);
        }

        List<Integer> result = Exercise4673.result(numList);

        for (Integer integer : result) {
            System.out.println(integer);
        }
    }
}
