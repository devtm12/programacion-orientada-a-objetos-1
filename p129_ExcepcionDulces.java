import java.util.InputMismatchException;
import java.util.Scanner;

public class p129_ExcepcionDulces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Numero de niños en el barrio: ");
            int ninos = scanner.nextInt();
            System.out.print("Cantidad de dulces existente: ");
            int dulces = scanner.nextInt();
            
            int dulcesPorNino = dulces / ninos;
            System.out.println("A cada niño le tocan " + dulcesPorNino + " dulces.");
        } catch (InputMismatchException e) {
            System.out.println("Los niños y los dulces, deben ser cantidades numéricas");
        } catch (ArithmeticException e) {
            System.out.println("Si no hay dulces, no puedo repartir dulces");
        } finally {
            scanner.close();
        }
    }
}

