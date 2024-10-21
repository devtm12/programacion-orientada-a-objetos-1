package p117_FiguraGeometrica;

public class App {
    public static void main(String[] args) {
        Circulo miCirculo = new Circulo(100);
        System.out.println("Probando circulo");
        System.out.println(miCirculo);
        miCirculo.ajustar(10);
        System.out.println(miCirculo);

        Rectangulo miRectangulo = new Rectangulo(10, 20);
        System.out.println(miRectangulo);
        miRectangulo.ajustar(0.5);
        System.out.println(miRectangulo);
     }
}
