package p120_Vehiculo;

public class Maquina {
    private String nombre;
    private String propietario;
    private int pasajeros;

    public Maquina(String nombre, String propietario, int pasajeros) {
        this.nombre = nombre;
        this.propietario = propietario;
        this.pasajeros = pasajeros;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPropietario() {
        return propietario;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void repostar() {
        System.out.println("Repostando...");
    }

    public void arrancar() {
        System.out.println("Arrancando...");
    }

    public void frenar() {
        System.out.println("Frenando...");
    }

    public void mostrarInfo() {
        System.out.println("Maquina [Nombre=" + nombre + ", Propietario=" + propietario + ", Pasajeros=" + pasajeros + "]");
    }
}
