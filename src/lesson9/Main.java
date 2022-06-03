package lesson9;

public class Main {
    public static void main(String[] args) {
        Krug krug1 = new Krug(12);
        Krug krug2 = new Krug(12);
        Krug krug3 = new Krug(15);

        System.out.println(krug1.equals(krug2));

        System.out.println(krug1.hashCode());
        System.out.println(krug2.hashCode());
        System.out.println(krug3.hashCode());

        System.out.println(krug1);

    }
}
