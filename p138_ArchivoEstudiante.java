import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class p138_ArchivoEstudiante {

    public static void capturaMaterias(ArrayList<String> materias) {
        System.out.print("\033[H\033[2J");System.out.flush();
        String materia;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nIntroduce una materia y presiona <Enter> (deja vacío para terminar):");

        while (true) {
            materia = scanner.nextLine();
            if (!materia.isEmpty()) {
                materias.add(materia);
            } else {
                break;
            }
        }
    }

    public static void grabarMaterias(String archivo, ArrayList<String> materias) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo))) {
            for (String materia : materias) {
                writer.write(materia + "\n");
            }
            System.out.println("\nMaterias guardadas en el archivo correctamente.");
        } catch (IOException e) {
            System.out.println("\nError al guardar las materias en el archivo.");
        }
    }


    public static ArrayList<String> leerMaterias(String archivo) {
        ArrayList<String> materias = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String materia;
            while ((materia = reader.readLine()) != null) {
                materias.add(materia);
            }
            System.out.println("\nMaterias cargadas correctamente desde el archivo.");
        } catch (IOException e) {
            System.out.println("\nError al leer el archivo de materias.");
        }
        return materias;
    }

    public static void mostrarMaterias(ArrayList<String> materias) {
        System.out.println("\nLista de materias:");
        for (String materia : materias) {
            System.out.println(materia);
        }
    }

    public static void main(String[] args) {
        int opcion;
        String archivo = "materias.txt";
        ArrayList<String> materias = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("----- Menú de Procesamiento de Materias -----");
            System.out.println(" Capturar materias................[1]");
            System.out.println("Guardar materias en archivo.......[2]");
            System.out.println("Cargar materias desde archivo.....[3]");
            System.out.println("Mostrar materias..................[4]");
            System.out.println("Salir.............................[5]");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    capturaMaterias(materias);
                    break;
                case 2:
                    if (!materias.isEmpty()) {
                        grabarMaterias(archivo, materias);
                    } else {
                        System.out.println("\nNo hay materias para guardar, captura primero.");
                    }
                    break;
                case 3:
                    materias = leerMaterias(archivo);
                    break;
                case 4:
                    if (!materias.isEmpty()) {
                        mostrarMaterias(materias);
                    } else {
                        System.out.println("\nNo hay materias para mostrar.");
                    }
                    break;
                case 5:
                    System.out.println("\nSaliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }

            if (opcion != 5) {
                System.out.println("\nPresiona Enter para continuar.");
                scanner.nextLine();
            }
        } while (opcion != 5);

        scanner.close();
    }
}

