 
import java.util.Scanner;
 public class p36_CompraPizza {
    
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Scanner scanner = new Scanner(System.in);
        int cantidad;
        double totalCompra, descuento, totalConDescuento;
        String tamaño;

        System.out.println("Elige el tamaño de la pizza:");
        System.out.println("1. Chica ($5)");
        System.out.println("2. Mediana ($10)");
        System.out.println("3. Grande ($20)");
        int opción = scanner.nextInt();

        switch (opción) {
            case 1:
                tamaño = "Chica";
                break;
            case 2:
                tamaño = "Mediana";
                break;
            case 3:
                tamaño = "Grande";
                break;
            default:
                System.out.println("Opción inválida");
                return;
        }

        System.out.print("Elige la cantidad: ");
        cantidad = scanner.nextInt();

        switch (opción) {
            case 1:
                totalCompra = cantidad * 5;
                break;
            case 2:
                totalCompra = cantidad * 10;
                break;
            case 3:
                totalCompra = cantidad * 20;
                break;
            default:
                System.out.println("Opción inválida");
                return;
        }

        if (totalCompra > 2000) {
            descuento = totalCompra * 0.15;
            totalConDescuento = totalCompra - descuento;
        } else {
            descuento = 0;
            totalConDescuento = totalCompra;
        }

        System.out.println("Tamaño de la compra: " + tamaño);
        System.out.println("Cantidad comprada: " + cantidad);
        System.out.println("Total compra: $" + totalCompra);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total de compra con descuento: $" + totalConDescuento);
    }
}


