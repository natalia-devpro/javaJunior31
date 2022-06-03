package lesson9;

public class Krug {
    private int radius;

    public Krug() {
    }

    public Krug(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        // this - krug1
        // o - krug2
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Krug krug = (Krug) o;

        return this.radius == krug.radius;
    }

    @Override
    public int hashCode() {
        return radius;
    }

    @Override
    public String toString() {
        return "Круг {" +
                " радиус = " + radius +
                '}';
    }
}
