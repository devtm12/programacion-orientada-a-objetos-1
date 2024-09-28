public class p98_Circulo {
    public static void main(String[] args) {
        Circulo c1 = new Circulo(10.40);
        System.out.println(c1);
        Circulo c2 = new Circulo();
        c2.setRadio(12.45);
        System.out.println(c2.toString());
        System.out.println("El radio es : " + c2.getRadio());
        System.out.println("Area = " + c1.getArea());
        System.out.println("Circunferencia = " + c1.getCircunferencia());
    }
}

class Circulo {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public Circulo() {
        this.radio = 0;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double getCircunferencia() {
        return 2 * Math.PI * radio;
    }

    @Override
    public String toString() {
        return "Circulo [Radio=" + radio + "]";
    }
}

