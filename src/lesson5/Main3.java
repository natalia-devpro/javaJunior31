package lesson5;

public class Main3 {
    public static void main(String[] args) {
        /**
         * Есть текст от пользователя, нужно посчитать сколько в нем слов
         * и вывести на консоль числом
         */

        String text = "Есть текст от пользователя";
        String[] words = text.split(" ");
        System.out.println(words.length);




    }
}
