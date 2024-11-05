import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
public class p133_Archivo2 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        String[] nombres = { "Zaatecas", "Fresnillo", "Cd Guzman", "Rio Grande", "Guadalajara","Novolato","Zacatlan" };
        File arch = new File("Ciudades.txt");
        if(arch.exists())

        System.out.println("El archivo ya existe !");

        else {
            try {
                BufferedWriter fnombres = new BufferedWriter(new FileWriter(arch));
                for (String nombre : nombres)
                fnombres.write(nombre+"\n");
                fnombres.close();
            } catch (Exception e) {
                System.out.println("Problemas al procesar el archivo..");
                System.out.println(e);
            }
                }
                System.out.println("Longitud final el archivo escrito " + arch.length());
            }
}