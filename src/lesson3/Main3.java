package lesson3;

public class Main3 {
    public static void main(String[] args) {
        String text = "Hello world!!!";

        int lendthOfText = text.length();

        if(lendthOfText < 10){
            System.out.println("Это короткий текст");
        }else {
            System.out.println("Это длинный текст");
        }
    }
}
