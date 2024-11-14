package p147_TercerExamenParcial;

import java.io.*;
import java.util.ArrayList;

public class Util {


    public static ArrayList<Jugador> inicializarDatos() {
        ArrayList<Jugador> jugadores = new ArrayList<>();
        jugadores.add(new Jugador("Juan Perez", 28, 'M', "Soltero", "Delantero", 2500.0));
        jugadores.add(new Jugador("Maria Jimenez", 24, 'F', "Casado", "Defensa", 2300.0));
        jugadores.add(new Jugador("Carlos Fuentes", 30, 'M', "Soltero", "Portero", 3000.0));
        return jugadores;
    }


    public static void serializarDatos(String archivo, ArrayList<Jugador> datos) throws IOException {
        try (FileOutputStream arch = new FileOutputStream(archivo);
             ObjectOutputStream oos = new ObjectOutputStream(arch)) {
            oos.writeObject(datos);
        }
    }

    public static ArrayList<Jugador> desSerializarDatos(String archivo) throws IOException, ClassNotFoundException {
        try (FileInputStream arch = new FileInputStream(archivo);
             ObjectInputStream ois = new ObjectInputStream(arch)) {
            return (ArrayList<Jugador>) ois.readObject();
        }
    }
}

