package p120_Vehiculo;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        Sedan misSedan = new Sedan("Vochito", "Maria Diaz", 4);
        misSedan.mostrarInfo();
        misSedan.sistemaelectrico();
        misSedan.combustionInterna();
        misSedan.carroceriaTres();
        misSedan.chasisMonocasco();
        misSedan.repostar();
        misSedan.arrancar();
        misSedan.frenar();

        System.out.println();

       
        Suv miSuv = new Suv("La mamalona", "Carlos Castaneda", 6);
        miSuv.mostrarInfo();
        miSuv.sistemaelectrico();
        miSuv.combustionInterna();
        miSuv.transaccion4x4();
        miSuv.chasisindependiente();
        miSuv.repostar();
        miSuv.arrancar();
        miSuv.frenar();
    }
}