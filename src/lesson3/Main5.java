package lesson3;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        // консольное приложение по просчету прощади и периметра разных фигур

        System.out.println("Выберите фигуру:");
        System.out.println("1 - Квадрат");
        System.out.println("2 - Прямоугольник");
        System.out.println("3 - Треугольник");
        System.out.println("4 - Трапеция");
        System.out.println("5 - Овал");

        Scanner scanner = new Scanner(System.in);
        String figura = scanner.nextLine();

        if(figura.equals("1") || figura.equalsIgnoreCase("квадрат")){
            System.out.println("Введите сторону квадрата: ");
            String storona = scanner.nextLine();
            // "34" --> int
            int a = Integer.parseInt(storona);
            System.out.println("Периметр квадрата: " + (a + a + a + a));
            System.out.println("Площадь квадрата: " + (a * a));
        }
    }
}
