package p113_SegundoExamenParcial;

public class Equipo {
    private String Nombre;
    private String Liga;
    private Jugador[] Jugadores;
    private int ContadorJugadores;

    public Equipo(String nombre, String liga, int maxJugadores) {
        Nombre = nombre;
        Liga = liga;
        Jugadores = new Jugador[maxJugadores];
        ContadorJugadores = 0;
    }

    public Jugador[] getJugadores() {
        return Jugadores;
    }

   
    public void agregarJugador(Jugador jugador) {
        if (ContadorJugadores < Jugadores.length) {
            Jugadores[ContadorJugadores++] = jugador;
        } else {
            System.out.println("No se puede agregar más jugadores. El equipo está completo.");
        }
    }

    public double getTotalBono() {
        double totalBono = 0;
        for (int i = 0; i < ContadorJugadores; i++) {
            totalBono += Jugadores[i].getBono();
        }
        return totalBono;
    }

    public double getTotal() {
        double total = 0;
        for (int i = 0; i < ContadorJugadores; i++) {
            total += Jugadores[i].getTotal();
        }
        return total;
    }

    public int getTotalH() {
        int totalHombres = 0;
        for (int i = 0; i < ContadorJugadores; i++) {
            if (Jugadores[i].getSexo() == 'M') {
                totalHombres++;
            }
        }
        return totalHombres;
    }

    public int getTotalM() {
        int totalMujeres = 0;
        for (int i = 0; i < ContadorJugadores; i++) {
            if (Jugadores[i].getSexo() == 'F') {
                totalMujeres++;
            }
        }
        return totalMujeres;
    }

    public void reporte() {
        System.out.println("Equipo: " + Nombre + ", Liga: " + Liga);
        for (int i = 0; i < ContadorJugadores; i++) {
            System.out.println(Jugadores[i]);
        }
        System.out.println("Total Bono: " + getTotalBono());
        System.out.println("Total: " + getTotal());
        System.out.println("Total Hombres: " + getTotalH());
        System.out.println("Total Mujeres: " + getTotalM());
    }

    @Override
    public String toString() {
        return "Equipo: " + Nombre + ", Liga: " + Liga;
    }
}
