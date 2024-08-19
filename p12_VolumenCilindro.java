import java.util.Scanner;

public class p12_VolumenCilindro {
    public static void main(String[] args) {
      double volumen;
      int radio, altura;

      Scanner obj= new Scanner(System.in);

      System.out.print("Dame el radio del cilindro: ");
      radio = obj.nextInt();
      System.out.print("Dame la altura:");
      altura = obj.nextInt();
      volumen= Math.PI* (radio*radio)*altura;

      System.out.println(String.format("El cilindro con radio  %d y altura %d tiene  un volumen de %.2f",radio,altura,volumen));
    }
}
