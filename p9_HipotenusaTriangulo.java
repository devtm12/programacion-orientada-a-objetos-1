import java.util.Scanner;

public class p9_HipotenusaTriangulo{
    public static void main(String[] args) {
      double hipotenusa;
      int longitudLado1, longitudLado2;

      Scanner obj= new Scanner(System.in);

      System.out.print("Dame la longitud del lado 1: ");
      longitudLado1 = obj.nextInt();
      System.out.print("Dame la la longitud del lado 2:");
      longitudLado2 = obj.nextInt();
      hipotenusa= Math.sqrt(longitudLado1*longitudLado1+longitudLado2*longitudLado2);

      System.out.println(String.format("El triangulo longitud %d y longitud %d tiene una hipotenusa de %.2f",longitudLado1,longitudLado2,hipotenusa));
    }
}