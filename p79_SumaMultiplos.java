import java.util.Scanner;

public class p79_SumaMultiplos {
    public static void main(String[] args) {
       System.out.print("\033[H\033[2J");System.out.flush();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menú:");
        System.out.println("1. Suma de múltiplos de 3");
        System.out.println("2. Suma de múltiplos de 4");
        int opcion = scanner.nextInt();
        System.out.println("Ingrese rango inicial:");
        int ini = scanner.nextInt();
        System.out.println("Ingrese rango final:");
        int fin = scanner.nextInt();
        while (ini >= fin) {
            System.out.println("Rango inválido. Ingrese rango inicial menor que rango final:");
            ini = scanner.nextInt();
            fin = scanner.nextInt();
        }
        switch (opcion) {
            case 1:
                System.out.println("La suma de múltiplos de 3 es: " + sumaMultiplos(ini, fin, 3));
                break;
            case 2:
                System.out.println("La suma de múltiplos de 4 es: " + sumaMultiplos(ini, fin, 4));
                break;
            default:
                System.out.println("Opción inválida");
        }
    }

    public static int sumaMultiplos(int ini, int fin, int multiplo) {
        int suma = 0;
        for (int i = ini; i <= fin; i++) {
            if (i % multiplo == 0) suma += i;
        }
        return suma;
    }
}

