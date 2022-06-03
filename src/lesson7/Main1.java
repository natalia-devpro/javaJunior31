package lesson7;

public class Main1 {
    public static void main(String[] args) {
        Treugolnik treugolnik = new Treugolnik();
        treugolnik.setA(3);
        treugolnik.setB(4);
        treugolnik.setC(5);

        int perim = treugolnik.perimetr();
        System.out.println(perim);
    }
}
