package main.java.codingtest;

import java.util.*;

/**
 백준 10828번 스택
 **/
public class Exercise10828 {

    static final List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            String select = sc.next();

            if (select.equals("push")){
                Exercise10828.push(sc.nextInt());
            }

            if (select.equals("pop")){
               sb.append(Exercise10828.pop()).append('\n');
            }

            if (select.equals("size")){
                sb.append(Exercise10828.size()).append('\n');
            }

            if (select.equals("empty")){
                sb.append(Exercise10828.empty()).append('\n');
            }

            if (select.equals("top")){
                sb.append(Exercise10828.top()).append('\n');
            }
        }
        System.out.println(sb);

        sc.close();
    }

    public static void push(int number) {
        list.add(number);
    }

    public static int pop() {
        if (!list.isEmpty()) {
            Integer result = list.size();
            Integer num = list.get(result - 1);
            list.remove(result-1);
            return num;
        }
        return -1;
    }

    public static int size() {
        return list.size();
    }

    public static int empty() {
        if (list.isEmpty()){
            return 1;
        }
        return 0;
    }

    public static int top() {
        if (!list.isEmpty()) {
            return list.get(size()-1);
        }
        return -1;
    }

}
