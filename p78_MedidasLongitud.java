import java.util.Scanner;

public class p78_MedidasLongitud {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menú:");
        System.out.println("1. Convertir pulgadas a centímetros");
        System.out.println("2. Convertir metros a pies");
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Ingrese pulgadas:");
                double pulgadas = scanner.nextDouble();
                System.out.println(pulgadas + " pulgadas son " + pulgadasACentimetros(pulgadas) + " centímetros");
                break;
            case 2:
                System.out.println("Ingrese metros:");
                double metros = scanner.nextDouble();
                System.out.println(metros + " metros son " + metrosAPies(metros) + " pies");
                break;
            default:
                System.out.println("Opción inválida");
        }
    }

    public static double pulgadasACentimetros(double pulgadas) {
        return pulgadas * 2.54;
    }

    public static double metrosAPies(double metros) {
        return metros * 3.281;
    }
}

