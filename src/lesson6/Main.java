package lesson6;

public class Main {
    public static void main(String[] args) {
        int vowels = TextUtils.countVowels("ijefnjewrniewnd");
        System.out.println(vowels);

        TextUtils.printReverse("qwerty!!!");

        String codQwer = TextUtils.coding("qwerty");
        System.out.println(codQwer);

    }
}
