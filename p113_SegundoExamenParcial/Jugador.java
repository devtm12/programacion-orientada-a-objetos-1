package p113_SegundoExamenParcial;

abstract class Jugador {

    private String Nombre;
    private char Sexo;
    private String Descripcion;
    private double Salario;
    private double Total;

    public Jugador(String nombre, char sexo, String descripcion, double salario) {
        Nombre = nombre;
        Sexo = sexo;
        Descripcion = descripcion;
        Salario = salario;
    }

   
    public String getNombre() {
        return Nombre;
    }

    public char getSexo() {
        return Sexo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public double getSalario() {
        return Salario;
    }

    public double getTotal() {
        return Total;
    }
    public abstract double getBono();

    public void calcularTotal() {
        Total = Salario + getBono();
    }

    @Override
    public String toString() {
        return "Jugador [Nombre=" + Nombre + ", Sexo=" + Sexo + ", Descripcion=" + Descripcion 
                + ", Salario=" + Salario + ", Total=" + Total + "]";
    }
}

