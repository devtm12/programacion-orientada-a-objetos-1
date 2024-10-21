package p115_Telefono;

public class Telefono implements Radio, Gps {

    @Override
    public void DetenerRadio() {
      System.out.println("Deteniendo Radio...");
        
    }

    @Override
    public void IniciaRadio() {
     System.out.println("Iniciando Radio en la super G...");
        
    }

    @Override
    public void obtenerCoordenadas() {
       System.out.println("Obteniendo coordenadas(0,0)....... estas en casa...");
        
    }
    

}
