import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class p137_ArchivoDeportes {

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        String[] deportes = { "Fútbol", "Béisbol", "Ciclismo", "Atletismo", "Natación", "Motociclismo" };
        File archivo = new File("Deportes.txt");


        if (archivo.exists()) {
            System.out.println("El archivo ya existe.");
        } else {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo))) {
                for (String deporte : deportes) {
                    writer.write(deporte + "\n");
                }
                System.out.println("Los datos han sido escritos en el archivo correctamente.");
            } catch (IOException e) {
                System.out.println("Error al escribir en el archivo.");
                e.printStackTrace();
            }
        }


        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            System.out.println("\nContenido del archivo:");
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
            e.printStackTrace();
        }
    }

}
