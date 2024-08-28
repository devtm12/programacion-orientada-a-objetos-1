import java.util.Scanner;

public class p33_NumerosConsecutivos {

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3;

        System.out.print("Ingrese el primer número: ");
        num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        num2 = scanner.nextInt();

        System.out.print("Ingrese el tercer número: ");
        num3 = scanner.nextInt();

        if ((num2 - num1 == 1) && (num3 - num2 == 1)) {
            System.out.println("Los números son consecutivos.");
        } else {
            System.out.println("Error: Los números no son consecutivos.");
        }
    }
}


