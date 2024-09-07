    import java.util.Scanner;

    public class p61_SecuenciaNumeros {
        public static void main(String[] args) {
            System.out.print("\033[H\033[2J");System.out.flush();
            Scanner scanner = new Scanner(System.in);
            System.out.print("¿Cuántos renglones? ");
            int n = scanner.nextInt();
    
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        }
    }
    