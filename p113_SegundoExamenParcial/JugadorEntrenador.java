package p113_SegundoExamenParcial;

public class JugadorEntrenador extends Jugador {
    private int subordinados;
    private int proyectos;

    public JugadorEntrenador(String nombre, char sexo, String descripcion, double salario, int subordinados, int proyectos) {
        super(nombre, sexo, descripcion, salario);
        this.subordinados = subordinados;
        this.proyectos = proyectos;
        calcularTotal(); 
    }

    
    public double getBono() {
        return (getSalario() * 0.15) + (proyectos * 100) + (subordinados * 10); 
    }

    
    public String toString() {
        return "JugadorEntrenador [subordinados=" + subordinados + ", proyectos=" + proyectos + "]";
    }
}

