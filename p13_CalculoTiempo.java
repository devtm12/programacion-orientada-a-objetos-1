import java.util.Scanner;

public class p13_CalculoTiempo {
  
    public static void main(String[] args) {
      double horas, dias, minutos, segundos;

      Scanner obj= new Scanner(System.in);

      System.out.print("Dame una cantidad de horas: ");
      horas = obj.nextInt();
     dias= horas/24;
     minutos=horas*60;
     segundos=horas*3600;

      System.out.println(String.format("la cantidad de %.2f horas en dias son %.2f en minutos son %.2f y en segundos %.2f",horas,dias,minutos,segundos));
    }
}
