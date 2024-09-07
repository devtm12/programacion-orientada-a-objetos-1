import java.util.Scanner;

public class p63_SumaTerminos1 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuántos términos? ");
        int n = scanner.nextInt();

        double suma = 0;
        
        for (int i = 1; i <= n; i++) {
            System.out.print("1/" + i + " + ");
            suma += 1.0 / i;
        }
        System.out.println("\nSuma: " + suma);
    }
}

