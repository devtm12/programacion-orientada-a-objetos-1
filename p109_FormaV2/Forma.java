package p109_FormaV2;

abstract class Forma {
    private String color;
    private boolean relleno;

    public Forma() {}

    public Forma(String color, boolean relleno) {
        this.color = color;
        this.relleno = relleno;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isRelleno() {
        return relleno;
    }

    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }
    public abstract double getArea();
    public abstract double getPerimetro();

    @Override
    public String toString() {
        return "Forma [Color=" + color + ", Relleno=" + relleno + "]";
    }
}
