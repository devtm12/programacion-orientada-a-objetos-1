package p108_Vehiculo;

public class App {
    public static void main(String[] args) {
        
        Vehiculo[] vehiculos = new Vehiculo[4];
        vehiculos[0] = new Compacto("CP0100010122", "Ford", 2023, 125345.22, 4, 2);
        vehiculos[1] = new Compacto("CP1000145555", "Nissan", 2010, 54500.33, 6, 4);
        vehiculos[2] = new Camioneta("CA104014544", "Dina", 2008, 234567.15, 450.0, 4);
        vehiculos[3] = new Camioneta("CA774814599", "Hongyan", 2023, 934577.98, 1200.0, 6);

        
        System.out.println("Datos de los Vehiculos de la flota");
        for (Vehiculo v : vehiculos) {
            System.out.println(v);
        }

    
        System.out.println("\nCalculando el total de precio de todos los vehículos ...");
        double sumaPrecios = 0;
        for (Vehiculo v : vehiculos) {
            System.out.println(v.getPrecio());
            sumaPrecios += v.getPrecio();
        }
        System.out.println("La suma de precios es: " + sumaPrecios);
    }
}
