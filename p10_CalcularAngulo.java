import java.util.Scanner;

public class p10_CalcularAngulo {
    public static void main(String[] args) {
      double angulo3;
      int angulo1, angulo2;

      Scanner obj= new Scanner(System.in);

      System.out.print("Dame el angulo 1: ");
      angulo1 = obj.nextInt();
      System.out.print("Dame el angulo 2:");
      angulo2 = obj.nextInt();
      angulo3= 180 - (angulo1+angulo2);

      System.out.println(String.format("El triangulo de angulo %d y angulo %d tiene su tercer angulo es de %.2f",angulo1,angulo2,angulo3));
    }

}
