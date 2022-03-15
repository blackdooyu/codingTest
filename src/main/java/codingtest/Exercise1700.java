package main.java.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 백준 1700번 멀티탭 스케줄링
 */
public class Exercise1700 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        boolean used[] = new boolean[k + 1];
        int arr[] = new int[k];
        int result = 0;

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int idx = 0, cnt = 0;
        while (true) {
            if (cnt == n) break;
            if (!used[arr[idx]]) {
                used[arr[idx]] = true;
                cnt++;
            }
            idx++;
        }

        while (idx < k) {

            if (!used[arr[idx]]) {
                List<Integer> list = new ArrayList<>();
                for (int i = idx; i < k; i++) {
                    if (used[arr[i]] && !list.contains(arr[i])) {
                        list.add(arr[i]);
                    }
                }


                if (list.size() == n) {
                    int remove = list.get(list.size() - 1);
                    used[remove] = false;
                } else {
                    for (int j = 1; j <= k; j++) {
                        if (used[j] && !list.contains(j)) {
                            used[j] = false;
                            break;
                        }
                    }
                }

                used[arr[idx]] = true;
                result++;
            }

            idx++;
        }

        System.out.println(result);
    }
}
