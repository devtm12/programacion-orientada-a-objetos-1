package p96_Empleado03;

public class Empleado {
    private String Nombre;
    private int Edad;
    private char Sexo;
    private boolean Casado;

    public Empleado() {};
    public Empleado(String nombre,int edad,char sexo,boolean casado) {
        this.Nombre = nombre; this.Edad = edad;
        this.Sexo = sexo; this.Casado = casado;
    }

    public String getNombre() { return Nombre; }
    public int getEdad() { return Edad; }
    public char getSexo() { return Sexo; }
    public boolean getCasado() { return Casado; }
    public String toString() {

        return String.format("Nombre: %s, Edad: %d, Sexo: %s, Casado: %s", Nombre, Edad,(Sexo ==

        'M' ? "Mujer" : "Hombre"), (Casado ? "Casado" : "No Casado"));
    }
}