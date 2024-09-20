import java.util.Scanner;

public class p80_Angulo {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un ángulo entre 0 y 360 grados:");
        int angulo = scanner.nextInt();
        while (angulo < 0 || angulo > 360) {
            System.out.println("Ángulo inválido. Ingrese un ángulo entre 0 y 360 grados:");
            angulo = scanner.nextInt();
        }
        System.out.println("El ángulo es " + tipoAngulo(angulo));
    }

    public static String tipoAngulo(int angulo) {
        if (angulo < 90) {
            return "agudo";
        } else if (angulo == 90) {
            return "recto";
        } else if (angulo < 180) {
            return "obtuso";
        } else if (angulo == 180) {
            return "llano";
        } else {
            return "concavo";
        }
    }
}
