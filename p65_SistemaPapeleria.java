// Realizar un programa que permita llevar el control de venta de fotocopias
// Devani Carolina Trejo Martínez.
import java.util.Scanner;
public class p65_SistemaPapeleria {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Scanner scanner = new Scanner(System.in);

        final int PRECIO_CARTA = 3;
        final int PRECIO_OFICIO = 4;
        final int PRECIO_DOBLE_OFICIO = 6;

        int cantidadCarta = 0;
        int cantidadOficio = 0;
        int cantidadDobleOficio = 0;

        int totalVentas = 0;
        int totalImporte = 0;
        int ventaNumero = 1;

        System.out.println("---------------------------------");
        System.out.println("Papelería la Malena, SA. de CV.");
        System.out.println("Sistema de ventas de copias");
        System.out.println("---------------------------------");

        while (true) {
            System.out.println("Venta: " + ventaNumero);

          //ENTRADA
            System.out.print("Tipo de copia (C)arta $" + PRECIO_CARTA + ",(O)ficio $" + PRECIO_OFICIO + ",(D)oble Of $" + PRECIO_DOBLE_OFICIO + "? ");
            char tipoCopia = scanner.next().toUpperCase().charAt(0);

          
            System.out.print("Cantidad ? ");
            int cantidad = scanner.nextInt();

           //PROCESO
            switch (tipoCopia) {
                case 'C':
                    cantidadCarta += cantidad;
                    totalImporte += cantidad * PRECIO_CARTA;
                    break;
                case 'O':
                    cantidadOficio += cantidad;
                    totalImporte += cantidad * PRECIO_OFICIO;
                    break;
                case 'D':
                    cantidadDobleOficio += cantidad;
                    totalImporte += cantidad * PRECIO_DOBLE_OFICIO;
                    break;
                default:
                    System.out.println("Tipo de copia no válido.");
                    continue;
            }

            totalVentas += cantidad;

           
            System.out.print("Otra venta (S/N) ? ");
            char otraVenta = scanner.next().toUpperCase().charAt(0);
            if (otraVenta != 'S') {
                break;
            }

            ventaNumero++;
        }
//SALIDA
       
        System.out.println("---------------------------------------");
        System.out.println("Resumen diario de ventas");
        System.out.println("---------------------------------------");
        System.out.println("Ventas realizadas: " + ventaNumero);
        System.out.println("-------------------------");
        System.out.println("Carta     : " + cantidadCarta + " - $ " + (cantidadCarta * PRECIO_CARTA));
        System.out.println("Oficio    : " + cantidadOficio + " - $ " + (cantidadOficio * PRECIO_OFICIO));
        System.out.println("Doble Of. : " + cantidadDobleOficio + " - $ " + (cantidadDobleOficio * PRECIO_DOBLE_OFICIO));
        System.out.println("-------------------------");
        System.out.println("Tot. Ventas : " + totalVentas + " - $ " + totalImporte);

     
        if (totalVentas >50) {
            System.out.println("Esta venta es una : Venta moderada");
        } else if (totalVentas<=50 && totalVentas<=100)
        {System.out.println("Esta venta es una : venta frecuente");}
        else{
            System.out.println("Esta venta es una : Venta ocasional");
        }}
    }
