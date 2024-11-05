package p136_Archivos5;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Procesa {

    public static void capturaDatos(ArrayList<Persona> datos) {
        Scanner obj = new Scanner(System.in);
        System.out.println("\nIntroduce los datos de una Persona (nombre vacío para terminar): ");
        
        while (true) {
            System.out.print("\nNombre: ");
            String nombre = obj.nextLine();
            if (nombre.isEmpty()) break;

            System.out.print("Edad: ");
            int edad = obj.nextInt();

            System.out.print("Peso: ");
            double peso = obj.nextDouble();
            obj.nextLine(); 

            System.out.print("Correo: ");
            String correo = obj.nextLine();

            Persona persona = new Persona(nombre, edad, peso, correo);
            datos.add(persona);
        }
    }

    public static void grabarDatos(String archivo, ArrayList<Persona> datos) {
        try (ObjectOutputStream fdatos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            fdatos.writeObject(datos);
            System.out.println("\nDatos grabados correctamente.");
        } catch (IOException e) {
            System.out.println("\nError al grabar los datos en el archivo.");
        }
    }

    public static ArrayList<Persona> leerDatos(String archivo) {
        ArrayList<Persona> datos = new ArrayList<>();
        try (ObjectInputStream fdatos = new ObjectInputStream(new FileInputStream(archivo))) {
            datos = (ArrayList<Persona>) fdatos.readObject();
            System.out.println("\nDatos cargados correctamente.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("\nError al leer archivo.");
        }
        return datos;
    }

    public static void mostrarDatos(ArrayList<Persona> datos) {
        System.out.println("\nLos datos hasta el momento:");
        for (Persona persona : datos) {
            System.out.println(persona);
        }
    }
}
