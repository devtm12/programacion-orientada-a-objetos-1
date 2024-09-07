import java.util.Scanner;

public class p64_SumaTerminos2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuántos términos? ");
        int n = scanner.nextInt();

        int suma = 0;
        
        for (int i = 1; i <= n; i++) {
          
            int termino = 0;
            for (int j = 0; j < i; j++) {
                termino = termino * 10 + 1;
            }
            System.out.print(termino + " + ");
            suma += termino;
        }
        System.out.println("\nSuma: " + suma);
    }
}
