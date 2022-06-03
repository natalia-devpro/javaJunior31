package lesson7;

public class Main {
    public static void main(String[] args) {
        Tovar stol = new Tovar();
        Tovar computer = new Tovar();

        stol.setName("Письменный стол 1500*800");
        stol.setPrice(12000);
        stol.setSalePrice(9990);

        computer.setName("Макбук");
        computer.setPrice(210000);
        computer.setSalePrice(170000);

        System.out.println();

    }
}
