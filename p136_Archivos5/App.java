package p136_Archivos5;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int op;
        String archivo = "datos.dat";
        ArrayList<Persona> datos = new ArrayList<>();
        Scanner obj = new Scanner(System.in);

        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("----- Procesamiento de datos ---------------");
            System.out.println("Capturar datos ....................... [ 1 ]");
            System.out.println("Grabar datos en archivo ........... [ 2 ]");
            System.out.println("Leer datos de archivo ............ [ 3 ]");
            System.out.println("Mostrar datos ........................ [ 4 ]");
            System.out.println("Salir ................................ [ 5 ]");
            System.out.print("Elije opción: ");
            op = obj.nextInt();
            obj.nextLine(); // Consumir la línea nueva

            switch (op) {
                case 1:
                    if (datos.isEmpty()) {
                        System.out.println("\nSe capturan datos por primera vez\n");
                    } else {
                        System.out.println("\nLos datos a capturar se agregan a los datos existentes\n");
                    }
                    Procesa.capturaDatos(datos);
                    break;
                case 2:
                    if (!datos.isEmpty()) {
                        Procesa.grabarDatos(archivo, datos);
                    } else {
                        System.out.println("\nNo hay datos para grabar, captura datos antes.");
                    }
                    break;
                case 3:
                    datos = Procesa.leerDatos(archivo);
                    break;
                case 4:
                    if (!datos.isEmpty()) {
                        Procesa.mostrarDatos(datos);
                    } else {
                        System.out.println("\nNo hay datos para mostrar, captura datos o lee datos del disco.");
                    }
                    break;
                case 5:
                    System.out.println("\nSaliendo del sistema ....\n");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
            if (op != 5) {
                System.out.println("\n<Presiona Enter para continuar>");
                obj.nextLine();
            }
        } while (op != 5);

        obj.close();
    }
}
