package main.java.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
  백준 16206번 롤케이크
 **/
public class Exercise16206 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = Integer.parseInt(st.nextToken());
        int cut = Integer.parseInt(st.nextToken());
        int cake1[] = new int[count];
        int cake2[] = new int[count];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < count; i++) {
            String value = st.nextToken();
            if (Integer.parseInt(value) % 10 == 0) {
                cake1[i] = Integer.parseInt(value);
            } else {
                cake2[i] = Integer.parseInt(value);
            }
        }

        Arrays.sort(cake1);
        Arrays.sort(cake2);

        int result = 0;
        int index = 0;
        while (cut != 0 && index < cake1.length){

            if (cake1[index] == 10){
                cake1[index] = 0;
                result++;
                index++;
            } else if (cake1[index] == 20) {
                cake1[index] = 0;
                result += 2;
                index++;
                cut--;
            }else if (cake1[index] > 10){
                cake1[index] -= 10;
                cut--;
                result++;
            }else {
                index++;
            }
        }

        if (cut != 0){
            for (int i = 0; i < cake2.length; i++) {

                if (cake2[i] < 10){
                    continue;
                }

                int cutCake = cake2[i] / 10;
                if (cutCake > cut){
                    result += cut;
                    break;
                }

                result += cutCake;
                cut -= cutCake;
            }
        }

        System.out.println(result);

    }
}
