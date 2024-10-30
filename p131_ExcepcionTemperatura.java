import java.util.InputMismatchException;
import java.util.Scanner;

class TemperaturaExcesiva extends Exception {
    public TemperaturaExcesiva(String mensaje) {
        super(mensaje);
    }
}

public class p131_ExcepcionTemperatura {
    public static double convertirAFahrenheit(double celsius) throws TemperaturaExcesiva {
        if (celsius > 100) {
            throw new TemperaturaExcesiva("Temperatura demasiado alta, no se puede convertir");
        }
        return (celsius * 9/5) + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Dame una temperatura en centigrados: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = convertirAFahrenheit(celsius);
            System.out.printf("%.2f grados centigrados, equivale a %.2f grados Fahrenheit\n", celsius, fahrenheit);
        } catch (InputMismatchException e) {
            System.out.println("La temperatura a convertir, debe ser un valor numérico");
        } catch (TemperaturaExcesiva e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
