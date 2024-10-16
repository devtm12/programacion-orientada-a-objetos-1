package p113_SegundoExamenParcial;


public class App {
    public static void main(String[] args) {
       
        System.out.print("\033[H\033[2J"); System.out.flush();
        Equipo equipo = new Equipo("UAZ", "Primera División", 5);

        Jugador jugador1 = new JugadorActivo("Carlos", 'M', "Delantero", 5000, 20, 15);
        Jugador jugador2 = new JugadorActivo("Ana", 'F', "Defensa", 4000, 25, 2);
       
        Jugador jugador3 = new JugadorEntrenador("Miguel", 'M', "Entrenador Principal", 7000, 10, 5);
        Jugador jugador4 = new JugadorEntrenador("Laura", 'F', "Entrenadora Asistente", 6000, 5, 3);

     
        equipo.agregarJugador(jugador1);
        equipo.agregarJugador(jugador2);
        equipo.agregarJugador(jugador3);
        equipo.agregarJugador(jugador4);

       
        equipo.reporte();
    }
}

