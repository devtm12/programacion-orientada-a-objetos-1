import java.util.Scanner;

public class p92_MayorMenor {
    public static int pedirCantidadNumeros(Scanner scanner) {
        System.out.print("Ingrese la cantidad de números: ");
        return scanner.nextInt();
    }

    public static int[] pedirNumeros(Scanner scanner, int n) {
        int[] numeros = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        return numeros;
    }

    public static void mostrarNumeros(int[] numeros) {
        System.out.println("Números:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int encontrarMayor(int[] numeros) {
        int mayor = numeros[0];
        for (int num : numeros) {
            if (num > mayor) {
                mayor = num;
            }
        }
        return mayor;
    }

    public static int encontrarMenor(int[] numeros) {
        int menor = numeros[0];
        for (int num : numeros) {
            if (num < menor) {
                menor = num;
            }
        }
        return menor;
    }

    public static void mostrarMayorMenor(int mayor, int menor) {
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
    } 
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        Scanner scanner = new Scanner(System.in);
        int n = pedirCantidadNumeros(scanner);
        int[] numeros = pedirNumeros(scanner, n);

        mostrarNumeros(numeros);
        int mayor = encontrarMayor(numeros);
        int menor = encontrarMenor(numeros);
        mostrarMayorMenor(mayor, menor);
    }
}
