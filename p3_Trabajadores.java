//pagar a trabajadores
import java.util.Scanner;

public class p3_Trabajadores {
    public static void main(String[] args) {
        String nombre;
        int horas;
        double paga,tasa,impuesto,pagabruta,paganeta;
        Scanner obj = new Scanner(System.in);
        System.out.print("NOMBRE DEL TRABAJADOR: "); nombre=obj.nextLine();
        System.out.print("HORAS TRABAJADAS: "); horas=obj.nextInt();
        System.out.print("PAGA POR HORA: "); paga=obj.nextFloat();
        tasa= 0.03;
        pagabruta= horas * paga;
        impuesto=pagabruta*tasa;
        paganeta= pagabruta - impuesto;
        
        System.out.println("\nResumen de pagos\n");
        System.out.println(String.format("El trabajador %s, trabajo %d horas, a una paga de %.2f pesos la hora, con una tasa de impuesto de %.2f",nombre,horas,paga,tasa));

        System.out.println(String.format("Paga bruta   =%.2f",pagabruta));
        System.out.println(String.format("Impuestos     =%.2f",impuesto));
        System.out.println(String.format("Paga neta     =%.2f", paganeta));
    }

}

