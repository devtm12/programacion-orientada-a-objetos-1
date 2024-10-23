package p120_Vehiculo;

public class Suv extends Maquina implements TodoTerreno {
    public Suv(String nombre, String propietario, int pasajeros) {
        super(nombre, propietario, pasajeros);
    }

    @Override
    public void chasisindependiente() {
           System.out.println("Es un automóvil con chasis independiente es una Suv");
        
    }

    @Override
    public void transaccion4x4() {
     System.out.println("Es un automóvil con tracción 4x4 es una Suv");
    }

    @Override
    public void sistemaelectrico() {
    
                System.out.println("Es un automóvil con sistema eléctrico es una Suv");
    }

    @Override
    public void combustionInterna() {
        System.out.println("Es un automóvil de combustión interna es una Suv");
    }
}
