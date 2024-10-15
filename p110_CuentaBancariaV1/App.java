package p110_CuentaBancariaV1;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033(2J");
        CuentaBancaria c1 = new CuentaBancaria(5000);
        System.out.println("Saldo inicial: " + c1.getSaldo());
        c1.deposita(1000);
        System.out.println("Saldo despues del 1er deposito " + c1.getSaldo());
        double cr = 400;
        boolean ran = c1.retira(cr);
        if(ran) System.out.println("Retirate " + cr + "te quedan" + c1.getSaldo());
        else System.out.println("No tienes ni para los cigarros, ponte a trabajar");

        System.out.println("\nProbando clase cliente");
        Cliente cliente1 = new Cliente("Juan Perez", c1);
        System.out.println("Cliente 91 " + cliente1);
        Cliente cliente2 = new Cliente("Carlos Castañeda", new CuentaBancaria(1000));
        System.out.println(cliente2);
        cliente2.getCuenta().retira(900);
        System.out.println(cliente2);
        cliente1.getCuenta().retira(9000);
        System.out.println(cliente1);
        cliente2.getCuenta().deposita(10000);
        System.out.println(cliente2);
        Cliente mujer = new Cliente("Rocio", cliente2.getCuenta());
        mujer.getCuenta().retira(10100);
        System.out.println(cliente2);
    
        System.out.println("\nProbando clase Banco");
        Banco mibanco = new Banco("Banco Bienestar","Campus UAZ siglo XXI");
        mibanco.agregarCliente(cliente1);
        mibanco.agregarCliente(cliente2);
        Cliente cliente3 = new Cliente("Felipe Correa", new CuentaBancaria(2000));
        mibanco.agregarCliente(cliente3);
        mibanco.getClientes().get(0).getCuenta().deposita(1500);
        mibanco.getClientes().get(1).getCuenta().retira(1000);
        mibanco.getClientes().get(2).getCuenta().deposita(12000);
        System.out.println("\nResumen del Banco \n");
        System.out.println(mibanco);
        double totalbanco = 0.0;
        for(Cliente cliente : mibanco.getClientes()) {
        System.out.println(cliente);
        totalbanco += cliente.getCuenta().getSaldo();
        
        }
        System.out.println("\nTotal de dinero en el Banco : " + totalbanco);


}
}
