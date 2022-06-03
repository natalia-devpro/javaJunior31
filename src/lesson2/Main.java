package lesson2;

public class Main {
    public static void main(String[] args) {
        int moneyNal = 1000;
        int priseOfPizza = 230;
        int priseOfBuble = 26;
        double priseOfSveet = 2.5;

        int maxPizza =  moneyNal /  priseOfPizza ;
        int maxBuble = (moneyNal - maxPizza * priseOfPizza) / priseOfBuble;
        int maxSveet =   ( (moneyNal - maxPizza * priseOfPizza)- maxBuble * priseOfBuble) / (int) priseOfSveet;
        double sdacha = moneyNal -( maxPizza * priseOfPizza)-( maxBuble * priseOfBuble)-(maxSveet*priseOfSveet);


        System.out.println( "Пица:" +maxPizza);
        System.out.println( "Жвачка:" +maxBuble);
        System.out.println("Конфеты:" + maxSveet);
        System.out.println("Сдача в магазине:" +sdacha);
    }
}
