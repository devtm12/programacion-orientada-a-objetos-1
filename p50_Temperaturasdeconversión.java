
import java.util.Scanner;

public class p50_Temperaturasdeconversión {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
            System.out.flush();
        Scanner scanner = new Scanner(System.in);
        char respuesta= ' ';

        do {
            System.out.print("Temperatura Inicial: ");
            double inicial = scanner.nextDouble();
            System.out.print("Temperatura Final: ");
            double final_ = scanner.nextDouble();

            if (final_ < inicial) {
                System.out.println("El valor final no puede ser menor que el inicial.");
                continue;
            }

            System.out.println("------------------------------------");
            System.out.println("Centígrados Farenheit");
            System.out.println("------------------------------------");

            for (double i = inicial; i <= final_; i++) {
                double farenheit = (i * 9 / 5) + 32;
                System.out.printf("%.0f %16.1f\n", i, farenheit);
            }

            System.out.println("------------------------------------");
            System.out.print("¿Deseas continuar (S/N)? ");
            respuesta = scanner.next().toUpperCase().charAt(0);
        } while (respuesta == 'S');

        System.out.println("Gracias por utilizar este programa.");
    }
}

