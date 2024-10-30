import java.util.Scanner;

public class p128_ExcepcionRaiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Introduce un número: ");
            double numero = scanner.nextDouble();
            if (numero < 0) {
                throw new Exception("Error no puedo calcular la raíz cuadrada");
            }
            double raiz = Math.sqrt(numero);
            System.out.printf("El resultado es: %.2f\n", raiz);
        } catch (Exception e) {
            System.out.println("Error no puedo calcular la raíz cuadrada");
        } finally {
            scanner.close();
        }
    }
}


