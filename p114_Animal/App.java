package p114_Animal;

public class App {
    public static void main(String[] args) {
         Gato miGato= new Gato();
         System.out.print("\033[H\033[2J");
         miGato.sonido();
         miGato.dormir();
    }
}
