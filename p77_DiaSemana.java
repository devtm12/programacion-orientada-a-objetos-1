import java.util.Scanner;

public class p77_DiaSemana {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero entre 1 y 7:");
        int num = scanner.nextInt();
        while (num < 1 || num > 7) {
            System.out.println("Número inválido. Ingrese un número entre 1 y 7:");
            num = scanner.nextInt();
        }
        System.out.println("El día de la semana es: " + diaSemana(num));
    }

    public static String diaSemana(int num) {
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        return dias[num - 1];
    }
}



