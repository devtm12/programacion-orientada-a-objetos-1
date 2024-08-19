import java.util.Scanner;

public class p11_ConvertirTemperatura {
    
    public static void main(String[] args) {
      double Grados;
      int farenheit;

      Scanner obj= new Scanner(System.in);

      System.out.print("Dame la temperatura que desea covertir a farenheit:  ");
      farenheit = obj.nextInt();
      Grados= (farenheit-32 ) / 1.8;

      System.out.println(String.format("La temperatura %d convertida a grados celcius es de %.2f",farenheit,Grados));
    }

}
