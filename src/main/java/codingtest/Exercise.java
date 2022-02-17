package main.java.codingtest;

public class Exercise {

    public static int solution(int b) {
        int result = -1;

        int arr[] = new int[b+1];
        int value = b*b;

        for (int i = 1; i < arr.length; i++) {
            arr[i] = (i*i) + value;
        }

        int max = arr[b];

        for (int i = b ; ; i++){
            int c = i * i;

            if (c > max){
                break;
            }

            for (int j = 1; j < arr.length; j++) {
                if (c == arr[j]){
                    result = i;
                    break;
                }
            }
            if (result != -1){
                break;
            }
        }
        return result;
    }
    public static void main(String[] args) {

        System.out.println(solution(4));

    }
}
