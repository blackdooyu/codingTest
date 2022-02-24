package main.java.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

/**
 백준 8980번 택배
 **/
public class Exercise8980 {

    static class Box {


        public Box(int sendNum, int receiveNum, int boxQuantity) {
            this.sendNum = sendNum;
            this.receiveNum = receiveNum;
            this.boxQuantity = boxQuantity;
        }

        int sendNum;
        int receiveNum;
        int boxQuantity;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int boxInfo = Integer.parseInt(br.readLine());
        ArrayList<Box> boxList = new ArrayList<>();
        int nArr[] = new int[n + 1];

        for (int i = 0; i < boxInfo; i++) {
            st = new StringTokenizer(br.readLine());
            boxList.add(new Box(Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }

        Collections.sort(boxList, new Comparator<Box>() {
            @Override
            public int compare(Box o1, Box o2) {
                if (o1.receiveNum == o2.receiveNum){
                    return o1.sendNum - o2.sendNum;
                }
              return  o1.receiveNum - o2.receiveNum;
            }
        });
       int result = 0;

        for (Box box : boxList) {
            int max = 0;
            boolean check = true;

            for (int i = box.sendNum; i < box.receiveNum; i++) {
                if (nArr[i] >= c){
                    check = false;
                    break;
                }
                max = Math.max(max,nArr[i]);
            }

            if (check){
                int num = c - max;
                if (num > box.boxQuantity){
                    num = box.boxQuantity;
                }
                result += num;

                for (int i = box.sendNum; i < box.receiveNum; i++) {
                    nArr[i] += num;
                }
            }
        }
        System.out.println(result);

    }
}
