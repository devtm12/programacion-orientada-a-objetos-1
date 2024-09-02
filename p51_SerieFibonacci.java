import java.util.Scanner;
public class p51_SerieFibonacci {
public static void main(String[] args) {
    System.out.print("\033[H\033[2J");
    System.out.flush();
        Scanner scanner = new Scanner(System.in);
        char respuesta = 'S';

        while (respuesta == 'S') {
            System.out.print("Número de términos que deseas imprimir?: ");
            int n = scanner.nextInt();
            int a = 0, b = 1, i = 0;

            System.out.println("Los primeros " + n + " términos de la sucesión Fibonacci son:");
            while (i < n) {
                System.out.print(a + " ");
                int suma = a + b;
                a = b;
                b = suma;
                i++;
            }
            System.out.println();

            System.out.print("¿Deseas continuar (S/N)?: ");
            respuesta = scanner.next().toUpperCase().charAt(0);
        }

        System.out.println("Gracias por utilizar este programa.");
    }
}
