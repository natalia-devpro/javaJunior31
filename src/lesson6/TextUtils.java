package lesson6;

public class TextUtils {

    /**
     * Создадим метод, в который будем передавать любой текст,
     * а метод будет возвращать кол-во гласных букв в этом тексте
     *
     * 1 - модификатор доступа (одно их 4х слов)
     * Модифокатор доступа определяет область видимости данного метода
     * public - доступно внутри всего проекта
     * _______ (package) - доступен внутри текущего пакета
     * protected - доступен внутри текущего пакета и дочерним класса
     * private - доступен внутри текущего файла (текущего класса)
     *
     * 2 - static (пишем или нет)
     *
     * 3 - возвращаемый тип (String, int, boolean ... ) (или слово void если его нет)
     * 4 - название метода (по этмоу слову будем его будем вызывать)
     * 5 - явные входящие параметры
     * 6 - тело выполнения метода
     */

    public static int countVowels(String text){
        // text = "fdgkhfkjghkjrtjhdgbjdvbfjhdvfbjhsbfjhuy3r478y4hu45n"
        int count = 0;
        for(int i = 0; i < text.length(); i++){
            char ch = text.charAt(i);
            if(ch == 'a' || ch == 'o' || ch == 'e' || ch == 'u' || ch == 'i'){
                count++;
            }
        }
        return count;
    }

    /**
     * Метод, который печатает на консоль текст в обратном понядке, который мы передали
     *
     */

    public static void printReverse(String text){
        // text = "kdfhjhferhfwiehr"
        for(int i = text.length() - 1; i >= 0; i--){
            System.out.print(text.charAt(i));
        }
        System.out.println();
    }

    /**
     * Мы в метод передаем слово которое нужно закодировать
     * метод возвращает закодированное слово
     */

    public static String coding(String word){
        String alphabet = "abcdefghijklmnopqrstuvwxyzaABCD";

        String coddingWord = "";
        for(int i = 0; i < word.length(); i++){
            char currentCharFromText = word.charAt(i);
            int indexFromAlphabet = alphabet.indexOf(currentCharFromText);
            if(indexFromAlphabet != -1){
                char charToCodding = alphabet.charAt(indexFromAlphabet + 1);
                coddingWord = coddingWord + charToCodding;
            } else {
                coddingWord = coddingWord + currentCharFromText;
            }
        }
        return coddingWord;
    }


}
