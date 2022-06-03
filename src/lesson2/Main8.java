package lesson2;

public class Main8 {
    public static void main(String[] args) {
        // сколько мы заберем в банке через 5 лет, если отдадим
        // 100 000 на депозит под 18% годовых?
        // проценты добавляются к телу депозита ежемесячно

        double money = 100000;
        int year = 5;
        int prosent = 18;

        for (int month = 0; month < 12 * year; month++) {
            money = money + ((money / 100 * prosent) / 12);
        }
        System.out.println(money); // 244321.97756897428
        // 244232
        // 244321.97756897428

    }
}
