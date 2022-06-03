package lrsson4;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        String[][] tours = {{"Турция", "100000", "6 дней", "самолет"},
                            {"Египет", "150000", "5 дней", "самолет"},
                            {"Египет", "180000", "4 дня", "самолет"},
                            {"Карелия", "60000", "3 дня", "автобус"},
                            {"Байкал", "70000", "10 дней", "самолет"},
                            {"Сочи", "90000", "5 дней", "автобус"}};

        System.out.println("На какой бюджет рассчитываете?");
        // 70000 - выводим +- 15000 от той цены что он хочет

        Scanner scanner = new Scanner(System.in);
        String moneyStr = scanner.nextLine();
        int money = Integer.parseInt(moneyStr); // 80 000 +- 15 000

        for(int i = 0; i < tours.length; i++){
            String priceFromCurrentTourStr = tours[i][1];
            int priceFromCurrentTour = Integer.parseInt(priceFromCurrentTourStr); // 40 000
            if(money + 15000 >= priceFromCurrentTour && money - 15000 <= priceFromCurrentTour){
                System.out.printf("%s, %s рублей, на %s, %s \n", tours[i][0], tours[i][1], tours[i][2], tours[i][3]);
            }
        }

        // 1 - Начетать все туры в ... страну
        // 2 - Напечать все туры в ... страну ... транспотром
        // 3 - Напечатать среднюю стоимость поездки в любую страну
        // *** Напечать все туры от ... до ... дней
        // ***** Напечать туры, на ваш взгляд привлекательные покупателю


    }
}
