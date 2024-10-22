package p118_Calculadora;

public class App {
    public static void main(String[] args) {
        Calculadora micalc = new Calculadora();
        System.out.print("\033[H\033[2J");
        micalc.sumar(5, 10);
        micalc.restar(35, 15);
        micalc.dividir(45, 6);
        micalc.multiplicar(6, 9);
      
        }
}
