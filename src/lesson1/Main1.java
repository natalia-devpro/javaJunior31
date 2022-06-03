package lesson1;

public class Main1 {
    public static void main(String[] args) {
        // Есть ширина и длинна комнаты, есть ширина и длинна стола
        // Нужно посчитать сколько таких столов влезет в комнату

        double shirinaRoom = 3.4;
        double dlinnaRoom = 5;
        double shirinaTable = 2;
        double dlinnaTable = 1.5;

        double ploshadRoom = shirinaRoom * dlinnaRoom;
        double ploshadTable = shirinaTable * dlinnaTable;

        // ругается поскольку не совпадают типы
        // необходимо приведение типов double --> int
        // приведение типов бывает: нисходящее и вверхходящее
        int countTableInsertToRoom = (int)(ploshadRoom / ploshadTable);
        System.out.println(countTableInsertToRoom);
    }
}
