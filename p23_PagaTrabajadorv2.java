import java.util.Scanner;

public class p23_PagaTrabajadorv2 {
    public static void main(String[] args) {
        String nombre;
        int horas,extra=0;
        double paga,tasa,impuesto,pagabruta,paganeta;
        Scanner obj = new Scanner(System.in);

        tasa= 0.02f;
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Calculando la paga de un trabajador \n");
        System.out.print("NOMBRE DEL TRABAJADOR: "); nombre=obj.nextLine();
        System.out.print("HORAS TRABAJADAS: "); horas=obj.nextInt();
        System.out.print("PAGA POR HORA: "); paga=obj.nextFloat();


        if(horas>40){
            extra=horas-40;
            pagabruta= 40 *paga+(extra*paga*2);
        }else{
            pagabruta=horas*paga;
        }
        impuesto=pagabruta*tasa;
        paganeta=pagabruta-impuesto;
        System.out.println(String.format("El trabajador %s, trabajo %d horas, a una paga de %.2f pesos la hora, con una tasa de impuesto de %.2f",nombre,horas,paga,tasa));

        System.out.println(String.format("Paga bruta   =%.2f",pagabruta));
        System.out.println(String.format("Impuestos     =%.2f",impuesto));
        System.out.println(String.format("Paga neta     =%.2f", paganeta));
        System.out.println("\n FELICIDADES SI LLEGASTE HASTA AQUI ERES UN GRAN PROGRAMADOR ");
    }
}