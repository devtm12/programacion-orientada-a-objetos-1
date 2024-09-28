public class p99_Rectangulo {
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(1.2f, 3.4f);
        System.out.println(r1.toString());
        Rectangulo r2 = new Rectangulo();
        System.out.println(r2.toString());
        r1.setLargo(5.6f);
        r1.setAncho(7.8f);
        System.out.println(r1.toString());
        System.out.println("Longitud : " + r1.getLargo());
        System.out.println("Ancho : " + r1.getAncho());
        System.out.printf("El Area es : %.2f\n", r1.getArea());
        System.out.printf("El Perimetro es : %.2f\n", r1.getPerimetro());
    }
}

class Rectangulo {
    private float largo;
    private float ancho;

    public Rectangulo(float largo, float ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    public Rectangulo() {
        this.largo = 0;
        this.ancho = 0;
    }

    public float getLargo() {
        return largo;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getArea() {
        return largo * ancho;
    }

    public float getPerimetro() {
        return 2 * (largo + ancho);
    }

    @Override
    public String toString() {
        return "Rectangulo [Largo=" + largo + ", Ancho=" + ancho + "]";
    }
}

