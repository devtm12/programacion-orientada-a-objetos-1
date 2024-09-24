import java.util.Scanner;

public class p91_MayoresPromedio {

    public static int pedirCantidadCalificaciones(Scanner scanner) {
        System.out.print("Ingrese la cantidad de calificaciones: ");
        return scanner.nextInt();
    }

    public static float[] pedirCalificaciones(Scanner scanner, int n) {
        float[] calificaciones = new float[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese calificación " + (i + 1) + ": ");
            calificaciones[i] = scanner.nextFloat();
        }
        return calificaciones;
    }

    public static void mostrarCalificaciones(float[] calificaciones) {
        System.out.println("Calificaciones:");
        for (float cal : calificaciones) {
            System.out.print(cal + " ");
        }
        System.out.println();
    }

    public static float calcularSuma(float[] calificaciones) {
        float suma = 0;
        for (float cal : calificaciones) {
            suma += cal;
        }
        return suma;
    }

    public static float calcularPromedio(float suma, int n) {
        return suma / n;
    }

    public static void mostrarSumaPromedio(float suma, float promedio) {
        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);
    }

    public static void mostrarMayoresPromedio(float[] calificaciones, float promedio) {
        System.out.println("Calificaciones mayores al promedio:");
        for (float cal : calificaciones) {
            if (cal > promedio) {
                System.out.print(cal + " ");
            }
        }
    }public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        Scanner scanner = new Scanner(System.in);
        int n = pedirCantidadCalificaciones(scanner);
        float[] calificaciones = pedirCalificaciones(scanner, n);

        mostrarCalificaciones(calificaciones);
        float suma = calcularSuma(calificaciones);
        float promedio = calcularPromedio(suma, n);
        mostrarSumaPromedio(suma, promedio);

        mostrarMayoresPromedio(calificaciones, promedio);
    }
}

