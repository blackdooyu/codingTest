package main.java.codingtest;

import java.util.Scanner;

/**
  백준 13305번 주유소
 **/
public class Exercise13305 {

    public static int result(int cityLength[],int price[]) {
        int totalPrice = 0 ;
        boolean check = true;
        int index = cityLength.length;

        while(check){

                int minPrice = 0;
                int totalLength = 0;

                for (int j = 0; j < index; j++) {
                    if (price[minPrice] > price[j]){
                        minPrice = j;
                    }
                }

                for (int k = minPrice; k < index; k++) {
                    totalLength += cityLength[k];
                }

                index = minPrice;

                totalPrice += (price[minPrice] * totalLength);

                if (minPrice == 0){
                    check = false;
                }

        }
        return totalPrice;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int city = sc.nextInt();
        int cityLength[] = new int[city-1];
        int oilPrice[] = new int[city];

        for (int i = 0; i < cityLength.length; i++) {
            cityLength[i] = sc.nextInt();
        }

        for (int i = 0; i < oilPrice.length; i++) {
            oilPrice[i]=sc.nextInt();
        }

        int result = Exercise13305.result(cityLength, oilPrice);

        System.out.println(result);
    }
}
