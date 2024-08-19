import java.util.Scanner;

public class p14_ConvertirADolares {
    public static void main(String[] args) {
      double pesos, dolares;

      Scanner obj= new Scanner(System.in);

      System.out.print("Dame la cantidad en pesos Mexicanos: ");
      pesos = obj.nextInt();
      dolares= pesos/18.77;
      System.out.println(String.format("la cantidad de pesos en dolares es de %.2f",dolares));
    }
}
