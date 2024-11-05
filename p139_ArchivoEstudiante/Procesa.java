package p139_ArchivoEstudiante;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Procesa {

    public static void capturaDatos(ArrayList<Estudiante> datos) {
        Scanner obj = new Scanner(System.in);
        System.out.println("\nIntroduce los datos de un Estudiante (nombre vacío para terminar): ");
        
        while (true) {
            System.out.print("\nNombre: ");
            String nombre = obj.nextLine();
            if (nombre.isEmpty()) break;

            System.out.print("Edad: ");
            int edad = obj.nextInt();

            System.out.print("Promedio: ");
            double promedio = obj.nextDouble();
            obj.nextLine(); // Consumir la línea nueva

            System.out.print("Sexo (M/F): ");
            char sexo = obj.nextLine().toUpperCase().charAt(0);

            Estudiante estudiante = new Estudiante(nombre, edad, promedio, sexo);
            datos.add(estudiante);
        }
    }

    public static void grabarDatos(String archivo, ArrayList<Estudiante> datos) {
        try (ObjectOutputStream fdatos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            fdatos.writeObject(datos);
            System.out.println("\nDatos grabados correctamente.");
        } catch (IOException e) {
            System.out.println("\nError al grabar los datos en el archivo.");
        }
    }

    public static ArrayList<Estudiante> leerDatos(String archivo) {
        ArrayList<Estudiante> datos = new ArrayList<>();
        try (ObjectInputStream fdatos = new ObjectInputStream(new FileInputStream(archivo))) {
            datos = (ArrayList<Estudiante>) fdatos.readObject();
            System.out.println("\nDatos cargados correctamente.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("\nError al leer archivo.");
        }
        return datos;
    }

    public static void mostrarDatos(ArrayList<Estudiante> datos) {
        System.out.println("\nLos datos de los estudiantes:");
        for (Estudiante estudiante : datos) {
            System.out.println(estudiante);
        }
    }

    public static double calcularPromedioCalificaciones(ArrayList<Estudiante> datos) {
        double suma = 0;
        for (Estudiante estudiante : datos) {
            suma += estudiante.getPromedio();
        }
        return datos.size() > 0 ? suma / datos.size() : 0;
    }

    public static double calcularPromedioEdades(ArrayList<Estudiante> datos) {
        int suma = 0;
        for (Estudiante estudiante : datos) {
            suma += estudiante.getEdad();
        }
        return datos.size() > 0 ? (double) suma / datos.size() : 0;
    }

    public static int contarHombres(ArrayList<Estudiante> datos) {
        int count = 0;
        for (Estudiante estudiante : datos) {
            if (estudiante.getSexo() == 'M') {
                count++;
            }
        }
        return count;
    }

    public static int contarMujeres(ArrayList<Estudiante> datos) {
        int count = 0;
        for (Estudiante estudiante : datos) {
            if (estudiante.getSexo() == 'F') {
                count++;
            }
        }
        return count;
    }
}

