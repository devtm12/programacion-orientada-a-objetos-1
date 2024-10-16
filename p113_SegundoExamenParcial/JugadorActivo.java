package p113_SegundoExamenParcial;

public class JugadorActivo extends Jugador {
    private int partidos;
    private int goles;

    public JugadorActivo(String nombre, char sexo, String descripcion, double salario, int partidos, int goles) {
        super(nombre, sexo, descripcion, salario);
        this.partidos = partidos;
        this.goles = goles;
        calcularTotal(); 
    }

    @Override
    public double getBono() {
        return (getSalario() * 0.10) + (partidos * 50) + (goles * 5); 
    }

    @Override
    public String toString() {
        return "JugadorActivo [partidos=" + partidos + ", goles=" + goles + "]";
    }
}
