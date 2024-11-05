package p139_ArchivoEstudiante;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int op;
        String archivo = "estudiantes.dat";
        ArrayList<Estudiante> datos = new ArrayList<>();
        Scanner obj = new Scanner(System.in);

        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("----- Procesamiento de datos ---------------");
            System.out.println("Capturar datos ....................... [ 1 ]");
            System.out.println("Grabar datos en archivo ........... [ 2 ]");
            System.out.println("Leer datos de archivo ............ [ 3 ]");
            System.out.println("Mostrar datos ........................ [ 4 ]");
            System.out.println("Calcular promedios y contar ....... [ 5 ]");
            System.out.println("Salir ................................ [ 6 ]");
            System.out.print("Elije opción: ");
            op = obj.nextInt();
            obj.nextLine(); // Consumir la línea nueva

            switch (op) {
                case 1:
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
                    if (!datos.isEmpty()) {
                        System.out.printf("\nPromedio de calificaciones: %.2f\n", Procesa.calcularPromedioCalificaciones(datos));
                        System.out.printf("Promedio de edades: %.2f\n", Procesa.calcularPromedioEdades(datos));
                        System.out.println("Cantidad de hombres: " + Procesa.contarHombres(datos));
                        System.out.println("Cantidad de mujeres: " + Procesa.contarMujeres(datos));
                    } else {
                        System.out.println("\nNo hay datos para calcular, captura datos o lee datos del disco.");
                    }
                    break;
                case 6:
                    System.out.println("\nSaliendo del sistema ....\n");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
            if (op != 6) {
                System.out.println("\n<Presiona Enter para continuar>");
                obj.nextLine();
            }
        } while (op != 6);

        obj.close();
    }
}

